package Aulas_Ronald.Lab02;
public class Funcionario {
    private String nome;
    private double salarioHora;
    private final int ID_FUNC;
    private double horasTrabalhadasMes;
    private static int proxID = 1;
    public static final double SALARIO_HORA_MINIMO = 12.50;

    public Funcionario(String nome) {
        this.nome = nome;
        this.ID_FUNC = proxID++;
        this.salarioHora = SALARIO_HORA_MINIMO;
    }

    public Funcionario(String nome, double salarioHora) {
        this.nome = nome;
        this.ID_FUNC = proxID++;
        this.setSalarioHora(salarioHora);
    }

    public String getNome() {
        return nome;
    }

    public int getIDFuncionario() {
        return ID_FUNC;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public double calcularSalarioMes() {
        return horasTrabalhadasMes * salarioHora;
    }

    public void reiniciarMesTrabalho() {
        this.horasTrabalhadasMes = 0;
    }

    public void atualizarNome(String novoNome) {
        if (novoNome.contains(" ")) {
            this.nome = novoNome;
        } else {
            System.out.println("O nome deve conter pelo menos um sobrenome.");
        }
    }

    public void atualizarSalarioHora(double novoSalarioHora) {
        if (novoSalarioHora > this.salarioHora) {
            this.setSalarioHora(novoSalarioHora);
        } else {
            System.out.println("O novo salário hora deve ser maior que o atual.");
        }
    }

    public static int getProximoID() {
        return proxID;
    }

    public void adicionarDiaDeTrabalho(double horasTrabalhadasHoje) {
        if (horasTrabalhadasHoje >= 4) {
            this.horasTrabalhadasMes += horasTrabalhadasHoje;
        } else {
            System.out.println("O dia de trabalho deve ter pelo menos 4 horas completas.");
        }
    }

    private void setSalarioHora(double salarioHora) {
        this.salarioHora = Math.max(salarioHora, SALARIO_HORA_MINIMO);
    }
}