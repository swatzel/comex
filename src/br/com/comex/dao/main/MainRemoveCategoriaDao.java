package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.jdbc.ConnectionFactory;

public class MainRemoveCategoriaDao {

	public static void main(String[] args)throws SQLException {
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		CategoriaDao categoriaDao = new CategoriaDao(conexao);
			
		categoriaDao.remove(309L);
			
		conexao.close();
		
		System.out.println("Categoria removida com sucesso");

	}

}
