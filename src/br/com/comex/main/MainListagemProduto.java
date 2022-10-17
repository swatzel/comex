package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.csv.ConnectionFactory;

public class MainListagemProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		try (PreparedStatement stm = connection.prepareStatement("select * from COMEX.PRODUTO"))
		{
		stm.execute();
		try (ResultSet rst = stm.getResultSet())
		{
		while (rst.next()) {
			Long id = rst.getLong("id");
			String nome = rst.getString("nome");
			String descricao = rst.getString("descricao");
			Integer precoUnitario = rst.getInt("preco_unitario");
			Integer quantidadeEstoque = rst.getInt("quantidade_estoque");
			Integer categoriaId = rst.getInt("categoria_id");
			String tipo = rst.getString("tipo");
			
			System.out.println("ID: " + id + " | " + nome + " | Descrição: " +  descricao +
					  " | R$ " + precoUnitario + " | Qtd Estoque: " + quantidadeEstoque +
					  " | Categoria_ID: " + categoriaId + " | Tributação: " + tipo);
		
			
	      }
		}
	  }
	}
  }
}


