package comex;

public class MainCategoria {

	public static void main(String[] args) {
		
			
		Categoria categoria1 = new Categoria("INFORMÁTICA", StatusCategoria.ATIVA);
		System.out.println("Categoria " + categoria1.getNome() + " (" + categoria1.getId() + " - " + categoria1.getStatus() + ")");
		
				
		Categoria categoria2 = new Categoria("MÓVEIS", StatusCategoria.ATIVA);
		System.out.println("Categoria " + categoria2.getNome() + " (" + categoria2.getId() + " - " + categoria1.getStatus() + ")");
		
		Categoria categoria3 = new Categoria("LIVROS", StatusCategoria.INATIVA);
		System.out.println("Categoria " + categoria3.getNome() + " (" + categoria3.getId() + " - " + categoria3.getStatus() + ")");
		
		// Categoria teste com problema no nome
		Categoria categoria4 = new Categoria("OI", StatusCategoria.INATIVA); 
		System.out.println("Categoria " + categoria4.getNome() + " (" + categoria4.getId() + " - " + categoria4.getStatus() + ")");
		
		
		
			System.out.println("----------------");
		    System.out.println("Fim da Criação de Categoria");


	}
}
	
		
		


