package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Produto;
import Service.ProdutoService;

@WebServlet("/cadastrar.do")
public class ServletCadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProdutoService produtoService = new ProdutoService(); 
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto produtoModel = new Produto();
		produtoModel.setCodigo(Integer.valueOf(request.getParameter("codigo")));
		produtoModel.setNome(request.getParameter("nome"));
		produtoModel.setValor(Double.parseDouble(request.getParameter("valor")));
		produtoModel.setDescricao(request.getParameter("descricao"));
		produtoModel.setEstoque(Integer.valueOf(request.getParameter("estoque")));
		
		produtoService.cadastrar(produtoModel);
	}

}
