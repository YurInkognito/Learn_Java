package Aulas_Ronald.Lab04;

public class Gerente extends Funcionario{
    public Gerente(String nome, int mat, double sal, Funcionario chefe){
        super(nome, mat, sal, chefe);
    }
    @Override
    public double bonus(Trimestre t){
        if (t == Trimestre._4o){
            return salario * 0.15;
        } else {
            return super.bonus(t);
        }
    }
    public double bonus(){
        return salario * 0.2;
    }
}