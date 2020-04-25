package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Produto;
import Service.ProdutoService;

@WebServlet("/consultar.do")
public class ServletConsultar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProdutoService produtoService = new ProdutoService(); 
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		Produto produto = produtoService.consultar(codigo);
		
		response.getWriter().print(
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
