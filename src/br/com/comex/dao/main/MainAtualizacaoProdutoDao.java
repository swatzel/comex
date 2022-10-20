package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoTributavel;

public class MainAtualizacaoProdutoDao {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		ProdutoDao produtoDao = new ProdutoDao(conexao);
		
		Produto produto = produtoDao.buscaPorId(210L);
		
		produto.setNome("Clean Architecture Atualizado");
		produto.setDescricao("Autor: Robert C. Martin / Ano: 2022");
		produto.setPrecoUnitario(182);
		produto.setQuantidadeEstoque(5);
		produto.setProdutoTributavel(ProdutoTributavel.ISENTO);
		
		produtoDao.atualiza(produto);
		
		conexao.close();
		
		System.out.println("Produto atualizado com sucesso!");
		
	}
}
