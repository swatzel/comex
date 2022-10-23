package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estados;

public class MainInsereClienteDao {

	public static void main(String[] args) throws SQLException {
			Cliente novoCliente = new Cliente ("Gabriel Garcia", "05815456999-63", "99870-5566", "Avenida Inglaterra", "33", "Fundos", "Centro", "Cambé", Estados.PR);
			
			Connection conexao = new ConnectionFactory().recuperarConexao();
			
			ClienteDao clienteDao = new ClienteDao(conexao);
			clienteDao.insere(novoCliente);
			
			conexao.close();

	}

}
