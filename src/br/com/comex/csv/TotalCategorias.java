package br.com.comex.csv;

import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {
	
	public int calculaTotalCategorias (List<PedidoCsv> categorias) {
		List<String> categoriasJaIncluidas = new ArrayList<>();
		
		for (PedidoCsv pedidoCsv : categorias) {
			String categoria = pedidoCsv.getCategoria();
			
			if (!categoriasJaIncluidas.contains(categoria)) {
			
				categoriasJaIncluidas.add(categoria);
			}
		}
		
		return categoriasJaIncluidas.size();

	}
}
