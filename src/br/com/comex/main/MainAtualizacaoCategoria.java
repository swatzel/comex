package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.csv.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		
		try (PreparedStatement stm = connection.prepareStatement
				("Update COMEX.CATEGORIA set nome = 'LIVROS TÉCNICOS' where nome = 'LIVROS'"))
		{
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas atualizadas: " + linhasModificadas);
		
		
      }
	}
  }
}


