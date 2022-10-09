package br.com.comex.main;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.MontanteTotalVendas;
import br.com.comex.csv.PedidoCsv;

public class MainMontanteTotalVendas {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitor = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitor.lePedidoCsv();
		
		
		MontanteTotalVendas montanteTotalVendas = new MontanteTotalVendas();
		montanteTotalVendas.calculaTotalVendas(pedidos);
		


		System.out.println("Montante de vendas: " + NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format
		                  (montanteTotalVendas.calculaTotalVendas(pedidos)));
		
	}

	
}


