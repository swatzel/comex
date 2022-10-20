package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDao;
import br.com.comex.jdbc.ConnectionFactory;

public class MainRemoveProdutoDao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		ProdutoDao produtoDao = new ProdutoDao(conexao);
		produtoDao.remove(210L);
		
		produtoDao.listaTodos();
		
		conexao.close();
		
		System.out.println("Produto removido com sucesso");
		
		}

}
