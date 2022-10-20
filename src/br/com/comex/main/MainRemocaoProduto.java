package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainRemocaoProduto {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		try (PreparedStatement stm = connection.prepareStatement
				("delete from COMEX.PRODUTO where id = ?")){
		
		stm.setLong(1, 189);;
		
		stm.execute();
		
		
		Integer linhasRemovidas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas removidas: " + linhasRemovidas);
		
		
      }
    }
  }
}
