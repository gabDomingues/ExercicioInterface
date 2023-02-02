package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.services.ServicoContrato;
import model.services.ServicoPayPal;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();

		Contrato contrato = new Contrato(numeroContrato, data, valor);
		
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		
		ServicoContrato servico = new ServicoContrato(new ServicoPayPal());
		servico.processarContrato(contrato, parcelas);
		for(Parcelamento p : contrato.getParcelas()) {
			System.out.println(p);
		}
		
		sc.close();
	}

}
