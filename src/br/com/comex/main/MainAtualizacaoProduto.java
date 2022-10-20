package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainAtualizacaoProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		
		try (PreparedStatement stm = connection.prepareStatement
				("update COMEX.PRODUTO set nome = ?, descricao = ?, preco_unitario = ?, quantidade_estoque = ?, categoria_id = ?, tipo = ?  where id = ?"))
		{
			alteraProduto("Notebook Samsung Pro", "BOOK i7 8GB 256GB SSD", 4200, 4, 290, "ISENTO", 209, stm);
				
      }
	}
  }

	private static void alteraProduto(String nome, String descricao, int precoUnitario, int quantidadeEstoque, long categoriaId, String tipo, int id, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setDouble(3, precoUnitario);
		stm.setInt(4, quantidadeEstoque);
		stm.setLong(5, categoriaId);
		stm.setString(6, tipo);
		stm.setInt(7, id);
		
				
		stm.execute();

		Integer linhasModificadas = stm.getUpdateCount();

		System.out.println("Quantidade de linhas atualizadas: " + linhasModificadas);
	}
}


