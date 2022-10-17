package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.csv.ConnectionFactory;
import br.com.comex.dao.CategoriaDao;
import br.com.comex.modelo.Categoria;

public class MainListagemCategoriaDao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		CategoriaDao categoriaDao = new CategoriaDao(conexao);
		
		List<Categoria> listaDeCategorias = categoriaDao.listaTodas();
		
			for(Categoria categoria : listaDeCategorias) {
				
				System.out.println(categoria);
			}
		
		conexao.close();	

	}

}
