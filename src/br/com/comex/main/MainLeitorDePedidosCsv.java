package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;

public class MainLeitorDePedidosCsv {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidoCsv = leitorPedidosCsv.lePedidoCsv();
		
		
		System.out.println("Total de pedidos: " + pedidoCsv.size());
	
		}

}
