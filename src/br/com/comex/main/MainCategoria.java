package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainCategoria {

	public static void main(String[] args) {
		
		try {
			
			
		Categoria categoria1 = new Categoria("INFORMÁTICA", StatusCategoria.ATIVA);
		System.out.println("Categoria " + categoria1.getNome() + " (" + categoria1.getId() + " - " + categoria1.getStatus() + ")");
		
				
		Categoria categoria2 = new Categoria("MÓVEIS", StatusCategoria.ATIVA);
		System.out.println("Categoria " + categoria2.getNome() + " (" + categoria2.getId() + " - " + categoria1.getStatus() + ")");
		
		Categoria categoria3 = new Categoria("LIVROS", StatusCategoria.INATIVA);
		System.out.println("Categoria " + categoria3.getNome() + " (" + categoria3.getId() + " - " + categoria3.getStatus() + ")");
		
		//Categoria teste com problema no nome
		Categoria categoria4 = new Categoria("xx", StatusCategoria.INATIVA); 
		System.out.println("Categoria " + categoria4.getNome() + " (" + categoria4.getId() + " - " + categoria4.getStatus() + ")");
		
		} catch (IllegalArgumentException ex) {
			System.out.println("Erro ao criar categoria: " + ex.getMessage());
			System.out.println("----------------");
		}
		
			System.out.println("----------------");
		    System.out.println("Fim da Criação de Categoria");


	}
}
	
		
		


