package br.com.comex.csv;

import java.util.List;

public class MontanteTotalVendas {

	public double calculaTotalVendas (List<PedidoCsv> pedido) {
		   double totalVenda = 0.0;
					
							
		for (PedidoCsv pedidoCsv : pedido) {
			totalVenda = totalVenda 	 + 
			Double.parseDouble(pedidoCsv.getPreco()) * Double.parseDouble(pedidoCsv.getQuantidade());
				
		
			}
		
			return totalVenda;
	}
}
			


