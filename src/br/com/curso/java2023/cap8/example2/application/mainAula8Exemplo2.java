package br.com.curso.java2023.cap8.example2.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.curso.java2023.cap8.example2.entities.Produto;

public class mainAula8Exemplo2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Informe um produto");
		
		System.out.print(" Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("\n Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("\n Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.print("\n Entre com a quantidade de produtos para adicionar em estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.print("\n Dados atualizados: " + produto);
		
		System.out.print("\n Entre com a quantidade de produtos para remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.print("\n Dados atualizados: " + produto);
		
		sc.close();
	}
}
