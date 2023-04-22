package br.com.curso.java2023.cap7;

import java.util.Scanner;

public class mainOperadorBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Java perimite atribuir um valor em binário
		int mask = 0b00100000;
		int n = sc.nextInt();
		
		/*
		 Você informa um número inteiro qualquer de 8 bits nesse exemplo,
		 o Java converterá esse inteiro para um binário de 8 bits,
		 e testará bit a bi verificando se os bitas são iguais em cada posição.
		 Nesse exemplo, se entrarmos com o inteiro 32, ele será convertido pro binário 0010 0000.
		 Na variável mask, habilitamos um apenas para o sexto bit, que é o bit que queremos testar.
		 Se o sexto bit do número 32 em binário for 1, então o programa informará que é verdade. 
		 */
		if ( (n & mask) != 0 )
			System.out.println("Sexto bit é verdade!");
		else
			System.out.println("Sexto bit é falso!");
		
		sc.close();

	}

}
