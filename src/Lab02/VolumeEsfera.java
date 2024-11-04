package Lab02;
import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Digite o raio da esfera: ");
        double R = scanner.nextDouble();

        double volume = (4.0 / 3.0) * pi * Math.pow(R, 3);

        System.out.printf("O volume da esfera é: %.2f\n", volume);

        scanner.close();
    }
}