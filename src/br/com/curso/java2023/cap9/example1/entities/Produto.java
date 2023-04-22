package br.com.curso.java2023.cap9.example1.entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto() {
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
//		this.quantidade = 0; -- Por padrão por ser um int, inicializará em zero
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double valorTotalNoEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return this.nome
				+ ", $ "
				+ String.format("%.2f", this.preco)
				+ ", "
				+ this.quantidade
				+ " unidades, Total: R$ "
				+ String.format("%.2f", valorTotalNoEstoque());
	}
}
