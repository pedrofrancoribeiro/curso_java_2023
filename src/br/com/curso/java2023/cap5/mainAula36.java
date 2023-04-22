package br.com.curso.java2023.cap5;

import java.util.Scanner;

public class mainAula36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valorPlanoBasico = 50;
		int minutosConsumidos = 0;
		double valorAPagar = 0;
		
		System.out.print("Informe a quantidade de minutos consumidos: ");
		minutosConsumidos = scanner.nextInt();
		
		if(minutosConsumidos < 100) {
			valorAPagar = 50;
		} else {
			int minutosExcedidos = minutosConsumidos - 100;
			double valorMinutosExcedidos = (double) minutosExcedidos * 2;
			valorAPagar = valorPlanoBasico + valorMinutosExcedidos;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);
		
		scanner.close();
	}

}
