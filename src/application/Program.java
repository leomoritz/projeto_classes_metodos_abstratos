package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> contList = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char opcao = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income:");
			Double rendaAnual = sc.nextDouble();
			if (opcao == 'i') {
				System.out.print("Health expenditures: ");
				Double gastoSaude = sc.nextDouble();
				contList.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			} else {
				System.out.print("Number of employees: ");
				int qtdFunc = sc.nextInt();
				contList.add(new PessoaJuridica(name, rendaAnual, qtdFunc));
			}

		}

		System.out.println("\nTAXES PAID: ");
		double totalImposto = 0.0;
		for (Contribuinte contribuinte : contList) {
			totalImposto += contribuinte.impostoPago();
			System.out.println(contribuinte);
		}

		System.out.println("\nTOTAL TAXES: $ " + totalImposto);

		sc.close();

	}
}
