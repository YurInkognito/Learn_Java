package Aulas_Ronald.Lab01;

import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Digite um número inteiro (0 <= N <= 20): ");
            N = scanner.nextInt();

            if (N >= 0 && N <= 20) {
                break;
            } else {
                System.out.println("Número fora do intervalo permitido! Tente novamente.");
            }
        }

        long fatorial = calcularFatorial(N);
        System.out.println("O fatorial de " + N + " é: " + fatorial);

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}
