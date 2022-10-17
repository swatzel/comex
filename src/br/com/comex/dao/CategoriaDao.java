package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;


public class CategoriaDao {

private Connection conexao;
	
	public CategoriaDao(Connection conexao) { 
		this.conexao = conexao;
	}
	public void insere(Categoria categoria) throws SQLException {
	
		String sql = "insert into COMEX.CATEGORIA (nome, status) values (?, ?)";
		String[] colunaParaRetornar = {"id"};	
	
	try (PreparedStatement stm = conexao.prepareStatement(sql, colunaParaRetornar)){
		 
	stm.setString(1,categoria.getNome());
    stm.setString(2, categoria.getStatus().name());
	stm.execute();
	
	
	ResultSet rst = stm.getGeneratedKeys();
	rst.next(); 
	
	categoria.setId(rst.getLong(1));

	stm.close();
	 
	   }
	}

	public List<Categoria> listaTodas() throws SQLException {
			
			List<Categoria> categorias = new ArrayList<>();
			
			PreparedStatement stm = conexao.prepareStatement("select * from COMEX.CATEGORIA");
			
			ResultSet rst = stm.executeQuery();
				while (rst.next()) {
				categorias.add(this.populaCategoria(rst));
			}
				
			stm.close();
			rst.close();
			return categorias;
}

	private Categoria populaCategoria(ResultSet rst) throws SQLException {
			Categoria categoria = new Categoria(

				rst.getLong("id"),
				rst.getString("nome"),
				StatusCategoria.valueOf((rst.getString("status")))
				);
	
		categoria.setId(rst.getLong("id"));
		return categoria;
	}
	
	
	public void remove(Long id) throws SQLException {
			String sql = "delete from COMEX.CATEGORIA where id = ?";
			
			PreparedStatement stm = conexao.prepareStatement(sql);
		
			stm.setLong(1, id); 
		
			stm.execute();
			stm.close();
		
		}
	
	public void atualiza (Categoria 
			categoria) throws SQLException {
			String sql = "update COMEX.CATEGORIA set nome = ?, status = ? where id = ?";
			
			PreparedStatement stm = conexao.prepareStatement(sql);
			
			stm.setString(1, categoria.getNome());
			stm.setString(2, categoria.getStatus().name());
			stm.setLong(3, categoria.getId()); 
			stm.execute();
			
			stm.close();
			
	}

	public Categoria buscaPorId(long id) throws SQLException {
	String sql = "select * from COMEX.CATEGORIA where id = ?";
	
	PreparedStatement stm = this.conexao.prepareStatement(sql); 
		stm.setLong(1, id);
		
		ResultSet registro = stm.executeQuery();
			Categoria categoria = null;
			if (registro.next()) {
				categoria = this.populaCategoria(registro);
			}
			
			registro.close();
			stm.close();
							
			return categoria;
	}
}
		
		
		
	



