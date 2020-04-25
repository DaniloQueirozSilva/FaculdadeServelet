package Service;

import java.util.List;

import Dao.ProdutoDAO;
import Model.Produto;

public class ProdutoService {

	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public void cadastrar(Produto produtoModel) {
		produtoDAO.cadastrar(produtoModel);
	}

	public Produto consultar(int codigo) {
		
		return produtoDAO.consultar(codigo);	
	}

	public void atualizar(Produto produtoModel) {
		produtoDAO.alterar(produtoModel);
	}

	public void deletar(Produto produtoModel) {
		produtoDAO.excluir(produtoModel);
	}
	
	public List<Produto> listar() {
		
		return produtoDAO.listarProdutos();	
	}
}
