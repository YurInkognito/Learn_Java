package Aulas_Mitre.Veiculos;

import java.util.Scanner;

// Criar uma fábrica que tem uma lista de carros e uma lista de motos
// fabricados, inicialmente vazias.
// A cada veículo fabricado um custo correspondente é debitado do seu saldo.

// Criar um objeto que faz controle dos chassis. Fornece um número de chassi
// novo cada vez que solicitado.

public class Principal {
	public static void main(String[] args) {
		
		// formatacao para o chassi
		int num = 5;
		String numeroFormatado = String.format("ABC%05d", num);
		System.out.print( numeroFormatado );
		
		double custo_carro = 1000.00;
		double custo_moto = 800.50;

		Fabrica fabrica = new Fabrica(5000.0);
		Scanner scan = new Scanner(System.in);


//		Scanner scan1 = new Scanner(System.in);
//        String s1 = "\n\n 1 Fabricar carro \n 2 Fabricar moto";
//        String s2 = "\n 3 Contabilidade da fábrica \n 9 Sair \n Escolha uma opção: ";
//        String menu = s1 + s2;

		int choice = 0;
        while( choice != 9 ) {
            System.out.println("\n1 - Fabricar carro");
			System.out.println("2 - Fabricar moto");
			System.out.println("3 - Contabilidade");
			System.out.println("9 - Sair");
			System.out.print("Escolha uma opção: ");

			choice = scan.nextInt();

			switch (choice) {
				case 1:
					fabrica.fabricarCarro("Gol", 2025, 4, custo_carro);
					break;
				case 2:
					fabrica.fabricarMoto("CG 160", 2025, 160, custo_moto);
					break;
				case 3:
					fabrica.imprimirContabilidade();
					break;
				case 9:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		}

		scan.close();
	}
}
