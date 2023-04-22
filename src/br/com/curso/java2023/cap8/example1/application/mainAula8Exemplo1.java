package br.com.curso.java2023.cap8.example1.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.curso.java2023.cap8.example1.entities.Triangulo;

public class mainAula8Exemplo1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Informe os lados do primeiro triângulo: ");
		x.vertice1 = sc.nextDouble();
		x.vertice2 = sc.nextDouble();
		x.vertice3 = sc.nextDouble();
		
		System.out.println("Informe os lados do segundo triângulo: ");
		y.vertice1 = sc.nextDouble();
		y.vertice2 = sc.nextDouble();
		y.vertice3 = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("\n Triângulo x área: %.2f%n", x.area());
		System.out.printf("\n Triângulo y área: %.2f%n", y.area());
		
		if (areaX > areaY) {
			System.out.printf("\n Maior área: X%n");
		} else if (areaY > areaX) {
			System.out.printf("\n Maior área: Y%n");
		} else {
			System.out.printf("\n X e Y possuem área iguais%n");
		}
		
		sc.close();
	}

}
