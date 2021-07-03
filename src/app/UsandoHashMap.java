package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Consumidor;
import model.Produto;

public class UsandoHashMap {
	public static void main(String[] args) {

		Map<Consumidor, List<Produto>> compras = new HashMap<>();
		
		Consumidor consumidor1 = new Consumidor("Andrew", 123);
		Consumidor consumidor2 = new Consumidor("Ana", 321);
		
		Produto prod1 = new Produto("Iphone", 2500.0);
		Produto prod2 = new Produto("Notebook", 3100.0);
		Produto prod3 = new Produto("Guarda-Roupas", 1500.0);
		Produto prod4 = new Produto("HeadPhone", 250.0);
		
		List<Produto> listaProdutos1 = new ArrayList<Produto>();
		listaProdutos1.add(prod1);
		listaProdutos1.add(prod3);
		
		List<Produto> listaProdutos2 = new ArrayList<Produto>();
		listaProdutos2.add(prod2);
		listaProdutos2.add(prod4);
		
		compras.put(consumidor1, listaProdutos1);
		compras.put(consumidor2, listaProdutos2);
		
		for(Map.Entry<Consumidor, List<Produto>> entry : compras.entrySet()) {
			System.out.println(String.format("Consumidor - %s\nPortador(a) do CPF - %s\nComprou:", 
												entry.getKey().getNome(), entry.getKey().getCpf()));
			for(Produto prod: entry.getValue()) {
				System.out.println(String.format("Produto - %s\nPreço - R$ %.2f\n", 
												prod.getNome(), prod.getPreco()));
			}
		}
	}
}
