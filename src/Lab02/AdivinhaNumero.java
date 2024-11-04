package Lab02;

import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Pense em um número entre 0 e 100.");

        while (!acertou) {
            int palpite = (min + max) / 2;
            tentativas++;

            System.out.printf("O número que você pensou é %d? (s/n): ", palpite);
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("s")) {
                acertou = true;
                System.out.println("Adivinhei! O número é " + palpite + ".");
            } else {
                System.out.print("O número é maior ou menor que " + palpite + "? (m/n): ");
                char maiorMenor = scanner.next().charAt(0);

                if (maiorMenor == 'n') {
                    min = palpite + 1; // Ajusta o mínimo
                } else if (maiorMenor == 'm') {
                    max = palpite - 1; // Ajusta o máximo
                } else {
                    System.out.println("Entrada inválida. Por favor, digite 'm' ou 'n'.");
                }
            }
        }

        System.out.printf("Número de tentativas: %d\n", tentativas);

        scanner.close();
    }
}