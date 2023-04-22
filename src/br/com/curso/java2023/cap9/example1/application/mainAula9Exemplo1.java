package br.com.curso.java2023.cap9.example1.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.curso.java2023.cap9.example1.entities.Produto;

public class mainAula9Exemplo1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um produto");
		
		System.out.print(" Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.print("Entre com a quantidade de produtos para adicionar em estoque: ");
		quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.print("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Entre com a quantidade de produtos para remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.print("Dados atualizados: " + produto);
		
		sc.close();
	}
}
