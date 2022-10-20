package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;


@WebService

public class ComexWS {
	    
		Connection criaConexao = new ConnectionFactory().recuperarConexao();
        CategoriaDao categoriaDao = new CategoriaDao(criaConexao);
        
        		public List<Categoria> getCategorias() throws SQLException {
        	
        			List<Categoria> categorias = categoriaDao.listaTodas();
		
        			System.out.println(categorias);
	
        		return categorias;
	
		}


 public Categoria adicionarCategoria(Categoria categoria) throws SQLException {
	
		System.out.println("Inserindo categoria" + categoria);

		categoriaDao.insere(categoria);

		return categoria;
		}
}