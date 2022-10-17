package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.csv.ConnectionFactory;
import br.com.comex.modelo.StatusCategoria;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		try (PreparedStatement stm = connection.prepareStatement
				("delete from COMEX.CATEGORIA where status = ?")){
		
		stm.setString(1, String.valueOf(StatusCategoria.INATIVA)); 
		
		stm.execute();
		
		
		Integer linhasRemovidas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas removidas: " + linhasRemovidas);
		
		
      }
    }
  }
}
