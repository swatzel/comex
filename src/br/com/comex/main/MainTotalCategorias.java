package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.TotalCategorias;

public class MainTotalCategorias {

	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidosCsv leitor = new LeitorPedidosCsv();
		List<PedidoCsv> categorias = leitor.lePedidoCsv();
		
		TotalCategorias totalCategorias = new TotalCategorias();
		int total = totalCategorias.calculaTotalCategorias(categorias);
		System.out.println("Total de categorias: " + total);

		}
}
