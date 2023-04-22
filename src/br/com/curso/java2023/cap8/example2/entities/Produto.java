package br.com.curso.java2023.cap8.example2.entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
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
		return nome
				+ ", $ "
				+ String.format("%.2f", preco)
				+ ", "
				+ " unidades, Total: R$ "
				+ String.format("%.2f", valorTotalNoEstoque());
	}
}
