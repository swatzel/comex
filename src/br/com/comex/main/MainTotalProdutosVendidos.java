package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.TotalProdutosVendidos;

public class MainTotalProdutosVendidos {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitor = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitor.lePedidoCsv();
		
		
		TotalProdutosVendidos totalVendido = new TotalProdutosVendidos();
		totalVendido.calculaTotalProdutosVendidos(pedidos);
		

		System.out.println("Total de produtos vendidos: " +
		(totalVendido.calculaTotalProdutosVendidos(pedidos)));
		
	}

}
