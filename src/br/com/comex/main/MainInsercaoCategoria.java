package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.comex.csv.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		
			
		ConnectionFactory connectionfactory = new ConnectionFactory();
		try (Connection connection = connectionfactory.recuperarConexao()){
		
		connection.setAutoCommit(false);
		
        String[] colunaParaRetornar = {"id"};
		
			
		try (PreparedStatement stm = connection.prepareStatement
					("insert into COMEX.CATEGORIA (nome, status) values (?, ?)", colunaParaRetornar)
			){							
			adicionarVariavel(new Categoria ("INFORMÁTICA", StatusCategoria.ATIVA), stm);
			adicionarVariavel (new Categoria("MÓVEIS", StatusCategoria.INATIVA), stm);
			adicionarVariavel (new Categoria ("LIVROS", StatusCategoria.ATIVA), stm);
			
			
			connection.commit();	
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Rollback executado");
			connection.rollback();
		 }
	    }
	  }

	private static void adicionarVariavel(Categoria categoria, PreparedStatement stm) throws SQLException {
		stm.setString(1,categoria.getNome());
	    stm.setString(2, categoria.getStatus().name());
		stm.execute();
		
		
		
		try (ResultSet rst = stm.getGeneratedKeys())
		{
		while (rst.next()) {
		  System.out.println("ID Categoria criada com sucesso! ID: " + rst.getInt(1));
			
		
		   }
		}
	}
}	


