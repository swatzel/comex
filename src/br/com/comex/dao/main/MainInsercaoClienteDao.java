package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainInsercaoClienteDao {

	public static void main(String[] args) throws SQLException {
		Categoria novaCategoria = new Categoria ("MOVEIS", StatusCategoria.ATIVA);
		
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		CategoriaDao categoriaDao = new CategoriaDao(conexao);
		categoriaDao.insere(novaCategoria);
		
		conexao.close();
		
		System.out.println("Categoria criada com sucesso");

	}

}
