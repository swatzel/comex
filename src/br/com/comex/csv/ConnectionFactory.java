package br.com.comex.csv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperarConexao() throws SQLException {
		return DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe", "system", "stephany");				
			
	}
}
