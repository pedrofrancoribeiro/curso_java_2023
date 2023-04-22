package br.com.curso.java2023.cap10.exercicio.negativos.application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("Digiete quantos números você vai digitar?");
		n = sc.nextInt();
		
		int[] vetorDeNumerosInteiros = new int[n];
		
		for (int i = 0; i < vetorDeNumerosInteiros.length; i++) {
			System.out.print("Digite um número: ");
			vetorDeNumerosInteiros[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i = 0; i < vetorDeNumerosInteiros.length; i++) {
			if (vetorDeNumerosInteiros[i] < 0)
				System.out.println(vetorDeNumerosInteiros[i]);
		}
		
		sc.close();
	}

}
