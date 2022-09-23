package comex;

public class ProdutoIsento extends Produto {
	
	
		public ProdutoIsento(long id, String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria) {
		super(id, nome, descricao, precoUnitario, quantidadeEstoque, categoria);
				
	}

		public double getCalculaImposto(){
		return 0;
		
	}
	
	}
