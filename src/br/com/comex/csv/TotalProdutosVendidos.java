package br.com.comex.csv;

import java.util.List;

public class TotalProdutosVendidos {

	public int calculaTotalProdutosVendidos (List<PedidoCsv> pedidos) {
		int somaProdutos = 0;
		
		for (PedidoCsv pedido : pedidos) {
			somaProdutos = somaProdutos + Integer.parseInt(pedido.getQuantidade());
			
			}
	
		return somaProdutos;
		
		
		}
			
	}



