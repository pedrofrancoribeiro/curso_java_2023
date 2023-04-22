package br.com.curso.java2023.cap9.exercicio.entidades;

public class Conta {
	
	private String numero;
	private String nomeTitular;
	private double saldo = 0;
	
	public Conta() {
	}
	
	public Conta(String numero, String nomeTitular) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}
	
	public Conta(String numero, String nomeTitular, double valorDepositoInicial) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		depositar(valorDepositoInicial);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		this.saldo -= 5.00;
		this.saldo -= valorSaque;
	}
	
	public String toString() {
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("Conta: " + getNumero());
		mensagem.append(", Titular: " + getNomeTitular());
		mensagem.append(", saldo: " + String.format("%.2f", getSaldo()) );
		return mensagem.toString();
	}
}
