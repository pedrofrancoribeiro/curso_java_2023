package br.com.curso.java2023.cap10.exercicio.alturas.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.curso.java2023.cap10.exercicio.alturas.entidades.Pessoa;

public class main {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		double somatorioDasAlturas = 0;
		int quantidadeIdadesMenor16 = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %dª pessoa: \n", i+1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			somatorioDasAlturas += altura;
			
			if (idade < 16)
				quantidadeIdadesMenor16++;
			
			pessoas[i] = new Pessoa(nome, idade, altura);	
		}
		
		double mediaAltura = somatorioDasAlturas/pessoas.length;
		double porcentagemIdadeMenor16 = (quantidadeIdadesMenor16*100)/pessoas.length;
		
		System.out.printf("Altura média: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemIdadeMenor16);
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16)
				System.out.println(pessoas[i].getNome());
		}
		
		
		sc.close();
	}
}
