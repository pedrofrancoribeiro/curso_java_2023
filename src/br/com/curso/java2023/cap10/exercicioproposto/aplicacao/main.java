package br.com.curso.java2023.cap10.exercicioproposto.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.curso.java2023.cap10.exercicioproposto.entidades.Funcionario;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.print("Quantos funcionários você irá registrar?");
		int n = sc.nextInt();
		
		for (int i = 0; i< n; i++) {
			System.out.print("empregado #" + (i+1) + ": \n");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			funcionarios.add(funcionario);
		}
		
		System.out.print("Informe o ID do funcionário que terá o salário aumentado: ");
		int idFuncionario = sc.nextInt();
		
		Funcionario funcionarioCadastrado = funcionarios
											.stream()
											.filter(funcionario -> funcionario.getId() == idFuncionario)
											.findFirst()
											.orElse(null);
		
		if (funcionarioCadastrado != null) {
			System.out.print("Entre com a porcentagem de aumento: ");
			double porcentagemDeAumentoDoSalario = sc.nextDouble();
			for (int i = 0; i < funcionarios.size(); i++) {
				if (funcionarios.get(i).getId() == idFuncionario)
					funcionarios.get(i).aumentarSalario(porcentagemDeAumentoDoSalario);
			}
			
		} else {
			System.out.println("Este ID não existe.");
		}
		
		System.out.println("Lista de empregados: ");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getId() + ", " + funcionario.getNome() + ", " + funcionario.getSalario());
		}
		
		sc.close();
	}

}
