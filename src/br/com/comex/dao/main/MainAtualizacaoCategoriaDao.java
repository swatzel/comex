package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.csv.ConnectionFactory;
import br.com.comex.dao.CategoriaDao;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainAtualizacaoCategoriaDao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		CategoriaDao categoriaDao = new CategoriaDao(conexao);
		
		Categoria categoria = categoriaDao.buscaPorId(290L);
		
		categoria.setNome("LIVROS TÉCNICOS");
		categoria.setStatus(StatusCategoria.INATIVA);
		
		categoriaDao.atualiza(categoria);
				
		conexao.close();
		System.out.println("Categoria atualizada com sucesso!");
		
		}

}
