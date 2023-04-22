package br.com.curso.java2023.cap7;

import java.util.Scanner;

public class mainExampleFunctions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 números:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		show(maior);
		
		sc.close();

	}
	
	public static int max(int a, int b, int c) {
		int maior;
		
		if ( a > b && a > c) 
			maior = a;
		else if(b > c)
			maior = b;
		else
			maior = c;
		
		return maior;
	}
	
	public static void show(int value) {
		System.out.println("Maior valor é " + value);
	}

}
