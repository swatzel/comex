package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.csv.ConnectionFactory;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionfactory = new ConnectionFactory();
		Connection connection = connectionfactory.recuperarConexao();
		
		
		System.out.println("Conexão efetuada com sucesso");	
		
		connection.close();
		

	}
}
