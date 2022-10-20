package br.com.comex.csv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.CrudProduto;

public class InsercaoCrudProduto {

	public static void main(String[] args) throws SQLException {
		 CrudProduto comoda = new CrudProduto ("comoda", "comodaVertical", 150.00, 10, 119, "ISENTA");
		 
		 try (Connection connection = new ConnectionFactory().recuperarConexao()) {
		 
		 
		 String sql = "INSERT INTO COMEX.PRODUTO (NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO) VALUES (?, ?, ?, ?, ?, ?)";
		 
		 try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				 
				 pstm.setString(1, comoda.getNome());
				 
				 

	  }
    }
  }
}
