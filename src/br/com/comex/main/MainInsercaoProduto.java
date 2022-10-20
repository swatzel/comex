package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoTributavel;

public class MainInsercaoProduto {

	public static void main(String[] args) throws SQLException {
		
			ConnectionFactory connectionfactory = new ConnectionFactory();
			try (Connection connection = connectionfactory.recuperarConexao()){
			
			connection.setAutoCommit(false);
			
	        String[] colunaParaRetornar = {"id"};
							
			try (PreparedStatement stm = connection.prepareStatement
						("insert into COMEX.PRODUTO (nome, descricao, preco_unitario, quantidade_estoque, categoria_id, tipo) values (?, ?, ?, ?, ?, ?)", colunaParaRetornar)
				){							 
				adicionarProduto(new Produto ("Notebook Samsung", "BOOK i3 8GB 256GB SSD", 
						3500, 1, new Categoria(288), ProdutoTributavel.NAO_ISENTO), stm);
				adicionarProduto(new Produto ("Clean Architecture","Autor: Robert C. Martin / Ano: 2017", 
						102.90, 2, new Categoria(290), ProdutoTributavel.NAO_ISENTO), stm);
				
									
				connection.commit();	
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Rollback executado");
				connection.rollback();
			 }
		    }
		  }

		private static void adicionarProduto(Produto produto, PreparedStatement stm) throws SQLException {
			stm.setString(1,produto.getNome());
		    stm.setString(2, produto.getDescricao());
		    stm.setDouble(3, produto.getPrecoUnitario());
		    stm.setInt(4, produto.getQuantidadeEstoque());
		    stm.setLong(5, produto.getCategoria().getId());
		    stm.setString(6, produto.getProdutoTributavel().name());
		    		   
		    stm.execute();
								
			try (ResultSet rst = stm.getGeneratedKeys())
			{
			while (rst.next()) {
			  System.out.println("Produto com sucesso! ID: " + rst.getInt(1));
				
		   }
		}
	}
}
		
							
	
	
	


