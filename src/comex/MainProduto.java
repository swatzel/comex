package comex;

public class MainProduto {

	public static void main(String[] args) {
		

		Categoria categoria1 = new Categoria();
		categoria1.setId(1);
		categoria1.setNome("INFORMÁTICA");
		categoria1.setStatus(StatusCategoria.ATIVA);
		
		Categoria categoria2 = new Categoria();
		categoria2.setId(2);
		categoria2.setNome("MÓVEIS");
		categoria2.setStatus(StatusCategoria.INATIVA);
		
		Categoria categoria3 = new Categoria();
		categoria3.setId(3);
		categoria3.setNome("LIVROS");
		categoria3.setStatus(StatusCategoria.ATIVA);
		
		
		Produto produto1 = new Produto(1, "Notebook Samsung", "BOOK i3 8GB 256GB SSD - Intel® Core™ i3 - 8GB", 3523.00, 1, categoria1);
			
		Produto produto2 = new Produto(2, "Clean Architecture", "Autor: Robert C. Martin / Ano: 2017 / Edição em Português", 102.90, 2, categoria3);
		
		Produto produto3 = new Produto(3, "Monitor Dell 27", "UltraSharp de 27\" com Tela Infinita U2722D", 1889.00, 3, categoria1);
		
				
		ProdutoIsento produtoIsento = new ProdutoIsento(2, "Clean Architecture", "Autor: Robert C. Martin / Ano: 2017 / Edição em Português", 102.90, 2, categoria2);
				
				
		System.out.println("O produto é ID (" + produto1.getId() + ") - " + produto1.getNome() + 
				" (Categoria: " + produto1.getCategoria().getNome()+ " - Descrição: " + produto1.getDescricao() + ")" + ". \n Seu preço é R$" + produto1.getPrecoUnitario() +
				". Atenção, em estoque há " + produto1.getQuantidadeEstoque() + " produtos(s).");
		System.out.println("O valor em estoque atual do " + produto1.getNome() +" é R$" + produto1.getValorEmEstoque());
		System.out.println("Importante! O valor do imposto do " + produto1.getNome() + " é R$ " + produto1.getCalculaImposto());
			
		System.out.println("");
		System.out.println("---------------- \n----------------");
		System.out.println("O produto é ID (" + produtoIsento.getId() + ") - " + produtoIsento.getNome() + 
				" (Categoria: " + produtoIsento.getCategoria().getNome() + " - Descrição: " + produtoIsento.getDescricao() + ")" + ". \n Seu preço é R$" + produtoIsento.getPrecoUnitario() +
				". Atenção, em estoque há " + produtoIsento.getQuantidadeEstoque() + " produtos(s).");
			System.out.println("O valor em estoque atual do " + produto2.getNome() +" é R$" + produto2.getValorEmEstoque());
		System.out.println("Importante! O valor do imposto do " + produtoIsento.getNome() + " é R$ " + produtoIsento.getCalculaImposto());
		
		System.out.println("");
		System.out.println("---------------- \n----------------");
		System.out.println("O produto é ID (" + produto3.getId() + ") - " + produto3.getNome() + 
				" (Categoria: " + produto3.getCategoria().getNome() + " - Descrição: " + produto3.getDescricao() +")" + ". \n Seu preço é R$" + produto3.getPrecoUnitario() +
				". Atenção, em estoque há " + produto3.getQuantidadeEstoque() + " produtos(s).");
		System.out.println("O valor em estoque atual do " + produto3.getNome() +" é R$" + produto3.getValorEmEstoque());
		System.out.println("Importante! O valor do imposto do " + produto3.getNome() + " é R$ " + produto3.getCalculaImposto());
		

	}

}





