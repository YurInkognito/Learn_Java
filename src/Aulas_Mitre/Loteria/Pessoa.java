package Aulas_Mitre.Loteria;

public class Pessoa {
    private String nome;
    private int numeroEscolhido;

    public Pessoa(String nome, int numeroEscolhido) {
        this.nome = nome;
        this.numeroEscolhido = numeroEscolhido;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroEscolhido() {
        return numeroEscolhido;
    }

    @Override
    public String toString() {
        return nome + " escolheu o número " + numeroEscolhido;
    }
}
