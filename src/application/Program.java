package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(numeroContrato, data, valor);
		
		sc.close();
	}

}
