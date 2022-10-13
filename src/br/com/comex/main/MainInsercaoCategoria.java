package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.comex.csv.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		
	
		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		connection.setAutoCommit(false);
		
        String[] colunaParaRetornar = {"id"};
		
			
		try (PreparedStatement stm = connection.prepareStatement
					("INSERT INTO COMEX.CATEGORIA (nome, status) VALUES (?, ?)", colunaParaRetornar)
			){							
			adicionarVariavel("INFORMÁTICA", "ATIVA", stm);
			adicionarVariavel("MÓVEIS", "INATIVA", stm);
			adicionarVariavel("LIVROS", "ATIVA", stm);
			
			connection.commit();	
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Rollback executado");
			connection.rollback();
		 }
	    }
	  }

	private static void adicionarVariavel(String nome, String status, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
	    stm.setString(2, status);
		stm.execute();
		
		
		
		try (ResultSet rst = stm.getGeneratedKeys())
		{
		while (rst.next()) {
		  System.out.println("ID Categoria criada com sucesso! ID: " + rst.getInt(1));
			
		
		   }
		}
	}
}	


