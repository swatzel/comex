package br.com.comex.modelo;

public class ProdutoIsento extends Produto {
	
	
		public ProdutoIsento( String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria, ProdutoTributavel produtotributavel) {
		super(nome, descricao, precoUnitario, quantidadeEstoque, categoria, produtotributavel);
				
	}

		public double getCalculaImposto(){
		return 0;
		
	}
	
	}
