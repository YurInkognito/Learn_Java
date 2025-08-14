package Aulas_Ronald.Lab01;

import java.util.Scanner;

public class CoroaCircular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o valor do raio maior (R): ");
        double R = scanner.nextDouble();

        System.out.print("Digite o valor do raio menor (r): ");
        double r = scanner.nextDouble();

        double area = PI * (Math.pow(R, 2) - Math.pow(r, 2));

        System.out.printf("A área da coroa circular é: %.4f%n", area);

        scanner.close();
    }
}
