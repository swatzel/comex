package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estados;

public class ClienteDao {
	
private Connection conexao;
	
	public ClienteDao(Connection conexao) { 
		this.conexao = conexao;
	}
	
	public void insere(Cliente cliente) throws SQLException {
	
		String sql = "insert into COMEX.CLIENTE (nome, cpf, telefone, rua, numero, complemento, bairro, cidade, UF) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		String[] colunaParaRetornar = {"id"};	
	
	try (PreparedStatement stm = conexao.prepareStatement(sql, colunaParaRetornar)){
		 
	stm.setString(1, cliente.getNome());
    stm.setString(2, cliente.getCpf());
    stm.setString(3, cliente.getTelefone());
    stm.setString(4, cliente.getRua());
    stm.setString(5, cliente.getNumero());
    stm.setString(6, cliente.getComplemento());
    stm.setString(7, cliente.getBairro());
    stm.setString(8, cliente.getCidade());
    stm.setString(9, cliente.getEstado().name());
	stm.execute();
	
	
	ResultSet rst = stm.getGeneratedKeys();
	rst.next(); 
	
	cliente.setId(rst.getLong(1));

	stm.close();
	 
	   }
	}

	public List<Cliente> listaTodos() throws SQLException {
			
			List<Cliente> clientes = new ArrayList<>();
			
			PreparedStatement stm = conexao.prepareStatement("select * from COMEX.CLIENTE");
			
			ResultSet rst = stm.executeQuery();
				while (rst.next()) {
				clientes.add(this.populaCliente(rst));
			}
				
			stm.close();
			rst.close();
			return clientes;
}

	private Cliente populaCliente(ResultSet rst) throws SQLException {
			Cliente cliente = new Cliente(

				rst.getLong("id"),
				rst.getString("nome"),
				rst.getString("cpf"),
				rst.getString("telefone"),
				rst.getString("rua"),
				rst.getString("numero"),
				rst.getString("complemento"),
				rst.getString("bairro"),
				rst.getString("cidade"),
				Estados.valueOf((rst.getString("UF")))
				);
	
		cliente.setId(rst.getLong("id"));
		return cliente;
	}
	
	
	public void remove(Long id) throws SQLException {
			String sql = "delete from COMEX.CLIENTE where id = ?";
			
			PreparedStatement stm = conexao.prepareStatement(sql);
		
			stm.setLong(1, id); 
		
			stm.execute();
			stm.close();
		
		}
	
	public void atualiza (Cliente cliente) throws SQLException {
			String sql = "update COMEX.CLIENTE set nome = ?, cpf = ?, telefone = ?, rua =?, numero = ?, complemento =?, bairro =?, cidade = ?, estado =?  where id = ?";
			
			PreparedStatement stm = conexao.prepareStatement(sql);
			
			
			stm.setString(1, cliente.getNome());
			stm.setString(2, cliente.getCpf());
			stm.setString(3, cliente.getTelefone()); 
			stm.setString(4, cliente.getRua());
			stm.setString(5, cliente.getNumero());
			stm.setString(6, cliente.getComplemento());
			stm.setString(7, cliente.getBairro());
			stm.setString(8, cliente.getCidade());
			stm.setString(9, cliente.getEstado().name());
			stm.setLong(10, cliente.getId());
			stm.execute();
			
			stm.close();
			
	}

	public Cliente buscaPorId(long id) throws SQLException {
	String sql = "select * from COMEX.CLIENTE where id = ?";
	
	PreparedStatement stm = this.conexao.prepareStatement(sql); 
		stm.setLong(1, id);
		
		ResultSet registro = stm.executeQuery();
			Cliente cliente = null;
			if (registro.next()) {
				cliente = this.populaCliente(registro);
			}
			
			registro.close();
			stm.close();
							
			return cliente;
	}
}

