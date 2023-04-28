package br.com.curso.java2023.cap11.exemplo1.aplicacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Programa1 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now(); // Data local
		LocalDateTime d02 = LocalDateTime.now(); // Data e hora local
		Instant d03 =Instant.now(); // Data e hora global
		
		System.out.println("d01 representa uma data local = " + d01.toString());
		/*
		 * Quatro horas a menos,
		 * se comparado a hora global de Londres.
		 */
		System.out.println("d02 representa uma data e hora local = " + d02.toString());
		
		/*
		 * Quatro horas a mais,
		 * se comparado a hora local de Manaus 
		 */
		System.out.println("d03 representa uma data e hora GLOBAl = " + d03.toString());
		System.out.println("d03 representa uma data e hora GLOBAl = " + d03.atZone(ZoneOffset.ofHours(-4)));
		
		/*
		 * Importante: a data informada como parâmetro da função parse,
		 * deve ser uma String que corresponda ao padrão ISO8601 
		 */
		
		
		/*
		 * Lançaria uma DateTimeParseException. Pois a data informada não corresponde ao padrão ISO8601
		LocalDate d04_2 = LocalDate.parse("23-04-2023");
		*/
		
		LocalDate d04 = LocalDate.parse("2023-04-23");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-23T07:23:37");
		
		System.out.println("d04 representa uma data gerada a partir do método parse da classe LocalDate = " + d04.toString());
		System.out.println("d05 representa uma data gerada a partir do método parse da classe LocalDateTime = " + d05.toString());
		
		/*
		 * Além da data no padrão ISO 8601, também é necessário informar um fuso horário 
		 */
		Instant d06 = Instant.parse("2023-04-23T08:03:45Z");
		/*
		 * Estamos informando uma data local, com fuso horário de Manaus, que é atrasado 4 horas em relação a Londres.
		 * O Java se encarregará de verificar que se tratar de um fuso horário diferenet do padrão (Londres),
		 * e acrescentará as 4 horas a data.
		 */
		Instant d07 = Instant.parse("2023-04-23T08:03:55-04:00");
		
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Passa de um padrão específico para o padrão ISO 8601
		LocalDate d08 = LocalDate.parse("23/04/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
	}

}
