package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoTributavel;

public class ProdutoDao {
	
private Connection conexao;
	
	public ProdutoDao(Connection conexao) { 
		this.conexao = conexao;
	}
	
	
	public void insere(Produto produto) throws SQLException {
		String sql = "insert into COMEX.PRODUTO (nome, descricao, preco_unitario, quantidade_estoque, categoria_id, tipo) values (?, ?, ?, ?, ?, ?)";

		String[] colunaParaRetornar = { "id" };
		
		PreparedStatement stm = conexao.prepareStatement(sql, colunaParaRetornar);
		stm.setString(1, produto.getNome());
		stm.setString(2, produto.getDescricao());
		stm.setDouble(3, produto.getPrecoUnitario());
		stm.setInt(4, produto.getQuantidadeEstoque());
		stm.setLong(5, produto.getCategoria().getId());
	    stm.setString(6, produto.getProdutoTributavel().name());
	    		   
		stm.execute();

		ResultSet rst = stm.getGeneratedKeys();
		rst.next();
		
		produto.setId(rst.getInt(1));
		stm.close();
	}

	public List<Produto> listaTodos() throws SQLException {
	   List<Produto> produtos = new ArrayList<>();
	   
	   PreparedStatement comandoPreparado = conexao.prepareStatement("select * from COMEX.PRODUTO");
	   
	   ResultSet registros = comandoPreparado.executeQuery();
	    while (registros.next()) {
	 	produtos.add(this.populaProduto(registros));
	}
	
	    registros.close();
	    comandoPreparado.close();
	
	    return produtos;
}

	private Produto populaProduto(ResultSet rst) throws SQLException {
	Produto produto = new Produto( 
			rst.getLong("id"), 
			rst.getString("nome"),
			rst.getString("descricao"),
			rst.getDouble("preco_unitario"),
			rst.getInt("quantidade_estoque"),
			new Categoria(rst.getLong("categoria_id")),
			ProdutoTributavel.valueOf((rst.getString("tipo")))
			);
	
	produto.setId(rst.getLong("id"));
	return produto;
	}


	public void atualiza(Produto produto) throws SQLException {
	
	String sql = "update COMEX.PRODUTO set nome = ?, descricao = ?, preco_unitario = ?, quantidade_estoque = ?, categoria_id = ?, tipo = ?  where id = ?";
	
	
	PreparedStatement stm = conexao.prepareStatement(sql);
		
	stm.setString(1, produto.getNome());
	stm.setString(2, produto.getDescricao());
	stm.setDouble(3, produto.getPrecoUnitario());
	stm.setInt(4, produto.getQuantidadeEstoque());
	stm.setLong(5, produto.getCategoria().getId()); 
	stm.setString(6, produto.getProdutoTributavel().name()); 
	stm.setLong(7, produto.getId());
			
	stm.execute();
	stm.close();
}
	
	public void remove(Long id) throws SQLException{
		String sql = "delete from COMEX.PRODUTO where id = ?";
		
		PreparedStatement stm = conexao.prepareStatement(sql);
		
		stm.setLong(1, id);
		stm.execute();
		stm.close();
		
	}
	
	public Produto buscaPorId(long id) throws SQLException {
		String sql = "select * from COMEX.PRODUTO where id = ?";
		
		PreparedStatement stm = this.conexao.prepareStatement(sql); 
			stm.setLong(1, id);
			
			ResultSet registro = stm.executeQuery();
				Produto produto = null;
				if (registro.next()) {
					produto = this.populaProduto(registro);
				}
				
				registro.close();
				stm.close();
								
				return produto;
		}
	}

			
