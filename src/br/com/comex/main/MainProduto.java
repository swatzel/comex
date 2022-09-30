package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;
import br.com.comex.modelo.StatusCategoria;

public class MainProduto {

	public static void main(String[] args) {
		
		try {
		
		Categoria categoria1 = new Categoria("INFORMÁTICA", StatusCategoria.ATIVA);
			
		Categoria categoria2 = new Categoria("MÓVEIS", StatusCategoria.INATIVA);
	
		Categoria categoria3 = new Categoria("LIVROS", StatusCategoria.ATIVA);
				
		
		Produto produto1 = new Produto("Notebook Samsung", "BOOK i3 8GB 256GB SSD - Intel® Core™ i3 - 8GB", 3523.00, 1, categoria1);
		
			System.out.println("O produto é ID (" + produto1.getId() + ") - " + produto1.getNome() + 
				" (Categoria: " + produto1.getCategoria().getNome()+ " - Descrição: " + produto1.getDescricao() + ")" + ". \n Seu preço é R$" + produto1.getPrecoUnitario() +
				". Atenção, em estoque há " + produto1.getQuantidadeEstoque() + " produtos(s).");
			System.out.println("O valor em estoque atual do " + produto1.getNome() +" é R$" + produto1.getValorEmEstoque());
			System.out.println("Importante! O valor do imposto do " + produto1.getNome() + " é R$ " + produto1.getCalculaImposto());
			
			System.out.println("");
			System.out.println("---------------- \n----------------");	
		
		
		
		Produto produto2 = new Produto("Clean Architecture", "Autor: Robert C. Martin / Ano: 2017 / Edição em Português", 102.90, 2, categoria3);
		
			System.out.println("O produto é ID (" + produto2.getId() + ") - " + produto2.getNome() + 
				" (Categoria: " + produto2.getCategoria().getNome()+ " - Descrição: " + produto2.getDescricao() + ")" + ". \n Seu preço é R$" + produto2.getPrecoUnitario() +
				". Atenção, em estoque há " + produto2.getQuantidadeEstoque() + " produtos(s).");
			System.out.println("O valor em estoque atual do " + produto2.getNome() +" é R$" + produto2.getValorEmEstoque());
			System.out.println("Importante! O valor do imposto do " + produto2.getNome() + " é R$ " + produto2.getCalculaImposto());
			
			System.out.println("");
			System.out.println("---------------- \n----------------");	
		
				
		
		Produto produto3 = new Produto("Monitor Dell 27", "UltraSharp de 27\" com Tela Infinita U2722D", 1889.00, 3, categoria1);
		
			System.out.println("O produto é ID (" + produto3.getId() + ") - " + produto3.getNome() + 
				" (Categoria: " + produto3.getCategoria().getNome() + " - Descrição: " + produto3.getDescricao() +")" + ". \n Seu preço é R$" + produto3.getPrecoUnitario() +
				". Atenção, em estoque há " + produto3.getQuantidadeEstoque() + " produtos(s).");
			System.out.println("O valor em estoque atual do " + produto3.getNome() +" é R$" + produto3.getValorEmEstoque());
			System.out.println("Importante! O valor do imposto do " + produto3.getNome() + " é R$ " + produto3.getCalculaImposto());
			
			System.out.println("");
			System.out.println("---------------- \n----------------");
		
			
					
		ProdutoIsento produtoIsento = new ProdutoIsento("Clean Architecture", "Autor: Robert C. Martin / Ano: 2017 / Edição em Português", 102.90, 2, categoria2);
				
				
			System.out.println("O produto é ID (" + produtoIsento.getId() + ") - " + produtoIsento.getNome() + 
	       " (Categoria: " + produtoIsento.getCategoria().getNome() + " - Descrição: " + produtoIsento.getDescricao() + ")" + ". \n Seu preço é R$" + produtoIsento.getPrecoUnitario() +
	       ". Atenção, em estoque há " + produtoIsento.getQuantidadeEstoque() + " produtos(s).");
			System.out.println("O valor em estoque atual do " + produto2.getNome() +" é R$" + produto2.getValorEmEstoque());
			System.out.println("Importante! Produto isento de imposto " + produtoIsento.getNome() + " - R$ " + produtoIsento.getCalculaImposto());
			
			System.out.println("");
			System.out.println("---------------- \n----------------");
		
			
			//Produto teste com produto zero em estoque
		 Produto produto4 = new Produto("Livro teste", null, 100, 0, categoria3);
				
			System.out.println("O produto é ID (" + produto4.getId() + ") - " + produto4.getNome() + 
					" (Categoria: " + produto4.getCategoria().getNome() + " - Descrição: " + produto4.getDescricao() +")" + ". \n Seu preço é R$" + produto3.getPrecoUnitario() +
					". Atenção, em estoque há " + produto4.getQuantidadeEstoque() + " produtos(s).");
			System.out.println("O valor em estoque atual do " + produto3.getNome() +" é R$" + produto4.getValorEmEstoque());
			System.out.println("Importante! O valor do imposto do " + produto4.getNome() + " é R$ " + produto4.getCalculaImposto());
				
			System.out.println("");
			System.out.println("---------------- \n----------------");
				
		} catch (IllegalArgumentException ex) {
			
			System.out.println("Erro ao criar o produto: " + ex.getMessage());
			System.out.println("----------------");
		}
			
		
		    System.out.println("Finalização da Criação de Produto"); 
			 
	}

}





