package br.com.comex.jdbc;

import java.sql.Connection;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		comboPooledDataSource.setUser("system");
		comboPooledDataSource.setPassword("stephany");
		
		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;
	}

		public Connection recuperarConexao()  {
		try {
			return dataSource.getConnection();
			
		} catch (Exception e) {
			
		}
		return null;				

			
	}
}
