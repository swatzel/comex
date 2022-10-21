package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.dao.ProdutoDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;


@WebService
public class ComexWS {
	    
		Connection criaConexao = new ConnectionFactory().recuperarConexao();
        CategoriaDao categoriaDao = new CategoriaDao(criaConexao);
        ProdutoDao produtoDao = new ProdutoDao(criaConexao);
        
@WebMethod(operationName="listarCategorias")	
        public List<Categoria> getCategorias() throws SQLException {
        	
        			List<Categoria> categorias = categoriaDao.listaTodas();
		
        			System.out.println(categorias);
	
        		return categorias;
	
		}

@WebMethod(operationName="adicionarCategorias")
 		public Categoria adicionarCategoria(Categoria categoria) throws SQLException {
	
 				categoriaDao.insere(categoria);
 				
 				System.out.println("Inserindo categoria" + categoria);

 			return categoria;
		}

@WebMethod(operationName="listarProdutos")
		public List<Produto> listarProdutos () throws SQLException {
	
		       List<Produto> produtos = produtoDao.listaTodos();
		       
		       return produtos; 
		       
	}
}