package br.com.comex.modelo;

public class CrudProduto {

		private String nome;
		private String descricao;
		private double precoUnitario;
		private Integer quantidadeEstoque;
		private Integer categoriaID;
		private String tipo;
		
public CrudProduto
(String nome, String descricao, double precoUnitario, Integer quantidadeEstoque,
				Integer categoriaID, String tipo) {
			super();
			this.nome = nome;
			this.descricao = descricao;
			this.precoUnitario = precoUnitario;
			this.quantidadeEstoque = quantidadeEstoque;
			this.categoriaID = categoriaID;
			this.tipo = tipo;
			
			
		}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public double getPrecoUnitario() {
	return precoUnitario;
}

public void setPrecoUnitario(double precoUnitario) {
	this.precoUnitario = precoUnitario;
}

public Integer getQuantidadeEstoque() {
	return quantidadeEstoque;
}

public void setQuantidadeEstoque(Integer quantidadeEstoque) {
	this.quantidadeEstoque = quantidadeEstoque;
}

public Integer getCategoriaID() {
	return categoriaID;
}

public void setCategoriaID(Integer categoriaID) {
	this.categoriaID = categoriaID;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}
	
	}


