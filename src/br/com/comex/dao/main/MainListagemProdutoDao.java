package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.csv.ConnectionFactory;
import br.com.comex.dao.ProdutoDao;
import br.com.comex.modelo.Produto;

public class MainListagemProdutoDao {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		ProdutoDao produtoDao = new ProdutoDao(conexao);
		
		List<Produto> listaDeProdutos = produtoDao.listaTodos();
		
			for(Produto produto : listaDeProdutos) {
				
				System.out.println(produto);
			}
		
		conexao.close();	
		
	}
}
