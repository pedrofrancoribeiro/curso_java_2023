package br.com.curso.java2023.cap4;

import java.util.Locale;
import java.util.Scanner;

public class mainAula25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double r;

		x = sc.next();
		System.out.println("Você digitou: " + x);
		y = sc.nextInt();
		System.out.println("Número inteiro digitado: " + y);
		r = sc.nextDouble();
		System.out.printf("Número double digitado: %.2f%n", r);

		sc.close();
	}

}
