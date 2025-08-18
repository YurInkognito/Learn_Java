package Aulas_Mitre.Loteria;

import java.util.Random;
import java.util.ArrayList;

public class Loteria {
    private int numeroSorteado;
    private ArrayList<Pessoa> participantes = new ArrayList<>();

    public void adicionarParticipante(Pessoa p) {
        participantes.add(p);
    }

    public void sortearNumero(int limite) {
        Random rand = new Random();
        numeroSorteado = rand.nextInt(limite) + 1; // sorteia de 1 até limite
        System.out.println("Número sorteado: " + numeroSorteado);
    }

    public void verificarGanhador() {
        boolean houveGanhador = false;
        for (Pessoa p : participantes) {
            if (p.getNumeroEscolhido() == numeroSorteado) {
                System.out.println("🎉 " + p.getNome() + " ganhou a loteria!");
                houveGanhador = true;
            }
        }
        if (!houveGanhador) {
            System.out.println("Ninguém ganhou desta vez.");
        }
    }
}
