package br.com.curso.java2023.cap8.example1.entities;

public class Triangulo {
	public double vertice1 = 0.0;
	public double vertice2 = 0.0;
	public double vertice3 = 0.0;
	
	private double perimetro() {
		return (vertice1 + vertice2 + vertice3)/2;
	}
	
	public double area() {
		double p = perimetro();
		return Math.sqrt(p*(p - vertice1)*(p - vertice2)*(p - vertice3));
	}
}
