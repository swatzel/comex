package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.csv.ConnectionFactory;
import br.com.comex.dao.ProdutoDao;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoTributavel;

public class MainInsercaoProdutoDao {
	
	public static void main(String[] args) throws SQLException {
		Produto novoProduto = new Produto ("Iphone 13 Apple", "128GB iOS 5G Wi-Fi Câmera Dupla 12MP", 
				5600, 2, new Categoria(288), ProdutoTributavel.NAO_ISENTO);
		
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		ProdutoDao produtoDao = new ProdutoDao(conexao);
		produtoDao.insere(novoProduto);
		
		conexao.close();
			
	}

}
