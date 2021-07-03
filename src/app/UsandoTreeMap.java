package app;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import model.Consumidor;
import model.Produto;

public class UsandoTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<Consumidor, List<Produto>> compras = new TreeMap<Consumidor, List<Produto>>();
	
		Consumidor consumidor1 = new Consumidor("Andrew", 444);
		Consumidor consumidor2 = new Consumidor("Ana", 555);
		Consumidor consumidor3 = new Consumidor("Maria", 111);		
				
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
		
		List<Produto> listaProdutos3 = new ArrayList<Produto>();
		listaProdutos3.add(prod1);
		listaProdutos3.add(prod4);
		
		compras.put(consumidor1, listaProdutos1);
		compras.put(consumidor2, listaProdutos2);
		compras.put(consumidor3, listaProdutos3);
		
		for(SortedMap.Entry<Consumidor, List<Produto>> entry : compras.entrySet()) {
			System.out.println(String.format("Consumidor - %s\nPortador(a) do CPF - %s\nComprou:", 
												entry.getKey().getNome(), entry.getKey().getCpf()));
			for(Produto prod: entry.getValue()) {
				System.out.println(String.format("Produto - %s\nPreço - R$ %.2f\n", 
												prod.getNome(), prod.getPreco()));
			}
		
		
		/*
		TreeMap<String, List<String>> lista = new TreeMap<String, List<String>>();
		
		List<String> amigos = new ArrayList<String>();
		amigos.add("Carlos");
		amigos.add("jose");
		
		List<String> amigos2 = new ArrayList<String>();
		amigos2.add("Andrew");
		amigos2.add("Mary");
		
		lista.put("5", amigos);
		lista.put("2", amigos2);
		
		System.out.println(lista);
		*/
		}
	}
}
