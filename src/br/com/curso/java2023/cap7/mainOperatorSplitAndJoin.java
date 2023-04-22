package br.com.curso.java2023.cap7;

public class mainOperatorSplitAndJoin {

	public static void main(String[] args) {
		String fraseOriginal = "potato apple lemon";
		String fraseOriginalMontadaDoVetor;
		
		String[] vect = fraseOriginal.split(" ");
		
		fraseOriginalMontadaDoVetor = String.join(" ", vect);
		
		System.out.println("Frase original: " + fraseOriginal);
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("palavra " + i + " : " + vect[i]);
		}
		
		System.out.println("frase original criada a partir de um vetor: " + fraseOriginalMontadaDoVetor);

	}

}
