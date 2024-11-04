package Lab03;

public class FuncionarioTest {
    public static void main(String[] args) {
        // Criar alguns funcionários
        Funcionario bill = new Funcionario("Bill Gates", "CEO", 1001, 55, null, 50000.0);
        Funcionario steve = new Funcionario("Steve Jobs", "CTO", 1002, 50, bill, 40000.0);
        Funcionario tim = new Funcionario("Tim Cook", "COO", 1003, 45, bill, 35000.0);
        Funcionario satya = new Funcionario("Satya Nadella", "CEO", 1004, 53, null, 55000.0);

        // Testar o método mesmaChefia
        System.out.println("Bill e Steve têm o mesmo chefe? " + bill.mesmaChefia(steve)); // true
        System.out.println("Bill e Tim têm o mesmo chefe? " + bill.mesmaChefia(tim)); // true
        System.out.println("Bill e Satya têm o mesmo chefe? " + bill.mesmaChefia(satya)); // false

        // Testar outros métodos
        System.out.println("Nome de Bill: " + bill.getNome());
        bill.setIdade(56);
        System.out.println("Nova idade de Bill: " + bill.getIdade());
        System.out.println("Chefe de Steve: " + steve.getChefe().getNome());
    }
}