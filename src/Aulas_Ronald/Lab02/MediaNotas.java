package Aulas_Ronald.Lab02;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        System.out.println("Digite as notas dos alunos. Digite -1 para finalizar.");

        while (true) {
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();

            if (nota == -1) {
                break; // Sai do loop quando nota é -1
            }

            soma += nota;
            contador++;
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("A média da turma é: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        scanner.close();
    }
}
