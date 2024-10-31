import java.util.Scanner;

public class CoroaCircular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o valor de pi
        final double PI = 3.14159;

        // Leitura dos valores dos raios R e r
        System.out.print("Digite o valor do raio maior (R): ");
        double R = scanner.nextDouble();

        System.out.print("Digite o valor do raio menor (r): ");
        double r = scanner.nextDouble();

        // Calculando a área da coroa circular
        double area = PI * (Math.pow(R, 2) - Math.pow(r, 2));

        // Exibindo o resultado
        System.out.printf("A área da coroa circular é: %.4f%n", area);

        scanner.close();
    }
}
