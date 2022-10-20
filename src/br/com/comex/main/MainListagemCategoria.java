package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		try (PreparedStatement stm = connection.prepareStatement("select * from COMEX.CATEGORIA"))
		{
		stm.execute();
		try (ResultSet rst = stm.getResultSet())
		{
		while (rst.next()) {
			Integer id = rst.getInt("id");
			String nome = rst.getString("nome");
			String status = rst.getString("status");
			
			System.out.println("ID: " + id + " | " + nome + " | " + status);
		
			
	      }
		}
	  }
	}
  }
}
