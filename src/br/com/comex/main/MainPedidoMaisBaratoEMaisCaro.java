package br.com.comex.main;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.PedidoMaisBaratoEMaisCaro;

public class MainPedidoMaisBaratoEMaisCaro {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitor = new LeitorPedidosCsv();
		List<PedidoCsv> pedidosCsv = leitor.lePedidoCsv();
		
		PedidoMaisBaratoEMaisCaro valorPedido = new PedidoMaisBaratoEMaisCaro();
		pedidosCsv.sort(valorPedido);
		
				
		System.out.println("Pedido mais barato: " + 
		NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format
		(Double.parseDouble(pedidosCsv.get(0).getPreco()) *
		Double.parseDouble(pedidosCsv.get(0).getQuantidade())) +
		" (" + pedidosCsv.get(0).getProduto() + ")");
		
				
		System.out.println("Pedido mais caro: " + 
		NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format
		(Double.parseDouble(pedidosCsv.get(pedidosCsv.size() - 1).getPreco()) * 
		Double.parseDouble(pedidosCsv.get(pedidosCsv.size() - 1).getQuantidade())) + 
		" (" + pedidosCsv.get(pedidosCsv.size() -1).getProduto() + ")");
		
		

	}

}
