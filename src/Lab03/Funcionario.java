package Lab03;

public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, int matricula, int idade, Funcionario chefe, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.idade = idade;
        this.chefe = chefe;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Funcionario getChefe() {
        return chefe;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Method to check if two Funcionarios have the same boss
    public boolean mesmaChefia(Funcionario outroFuncionario) {
        if (this.chefe == null && outroFuncionario.getChefe() == null) {
            return true;
        } else if (this.chefe == null || outroFuncionario.getChefe() == null) {
            return false;
        } else {
            return this.chefe.getMatricula() == outroFuncionario.getChefe().getMatricula();
        }
    }
}
