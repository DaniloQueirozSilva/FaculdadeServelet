package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Produto;
import Service.ProdutoService;

@WebServlet("/excluir.do")
public class ServletExcluir extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
	private final ProdutoService produtoService = new ProdutoService();
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto produtoModel = new Produto();
		produtoModel.setCodigo(Integer.valueOf(request.getParameter("codigo")));
		
		produtoService.deletar(produtoModel);
	}
}
