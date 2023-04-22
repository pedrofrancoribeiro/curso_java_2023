package br.com.curso.java2023.cap7;

public class mainFuncoesParaString {

	public static void main(String[] args) {
		
		String original = "O rato ROEU a RoUpa DO rEI De Roma    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2); // da posição 2 até o final (length - 1)
		
		// da posição 2 até uma posição antes do valor informado,
		// Ou seja, até a posição 8, representado nesse exemplo pela letra "O" em "ROEU"
		String s05 = original.substring(2, 9);
		
		String s06 = original.replace('r', 'x');
		
		// Se retornar -1,
		// é informando que o caracter não foi encontrado
		int posicaoDoPrimeiroValorEncontrado = original.indexOf('u');
		int posicaoDoUltimoValorEncontrado = original.lastIndexOf('U');
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('r','x'): -" + s06 + "-");
		System.out.println("indexOf('U'): -" + posicaoDoPrimeiroValorEncontrado + "-");
		System.out.println("lastIndexOf('U'): -" + posicaoDoUltimoValorEncontrado + "-");

	}

}
