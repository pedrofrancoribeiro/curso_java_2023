package br.com.curso.java2023.cap9.exercicio.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import br.com.curso.java2023.cap9.exercicio.entidades.Conta;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número da conta: ");
		String numeroConta = sc.nextLine();
		
		System.out.print("Entre com o nome do titular da conta");
		String nomeTitular = sc.nextLine();
		
		System.out.print("Terá um depósito inicial (y/n)?");
		
		char temDepositoInicial = sc.next().charAt(0);
		
		Conta conta = new Conta(numeroConta, nomeTitular);
		
		
		sc.close();
	}

}
