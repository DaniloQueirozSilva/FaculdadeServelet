package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Produto;
import Service.ProdutoService;

@WebServlet("/listar.do")
public class ServletListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProdutoService produtoService = new ProdutoService();  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Produto> listaProduto = produtoService.listar();
		
		for(Produto produto : listaProduto) {
			response.getWriter().println(
					"<table>"
							+"<tr>"
								+"<td>Matricula</td>"
								+"<td>Nome</td>"
								+"<td>CPF</td>"
								+"<td>Endereço</td>"
							+"</tr>"
							+"<tr>"
								+"<td>"+produto.getCodigo()+"</td>"
								+"<td>"+produto.getNome()+"</td>"
								+"<td>"+produto.getValor()+"</td>"
								+"<td>"+produto.getDescricao()+"</td>"
								+"<td>"+produto.getEstoque()+"</td>"
							+"</tr>"
					+"</table>");
		}
	}
}
