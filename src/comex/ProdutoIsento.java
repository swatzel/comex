package comex;

public class ProdutoIsento extends Produto {
	
	
		public ProdutoIsento(String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria) {
		super(nome, descricao, precoUnitario, quantidadeEstoque, categoria);
				
	}

		public double getCalculaImposto(){
		return 0;
		
	}
	
	}
