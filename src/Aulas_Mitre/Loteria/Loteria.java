package Aulas_Mitre.Loteria;

public class Loteria {
    private int MAX = 10;
    private int MIN = 1;
    private int num_sorteado;
    private Pessoa []bilhetes;
    public Loteria(){
        bilhetes = new Pessoa[MAX];
    }
    public void vender(Pessoa p1, int num){
        if(num >= MIN && num <= MAX && bilhetes[num-1] == null){
            bilhetes[num-1] = p1;
            p1.setBilhete(num);
        }
        else{
            System.out.println("Número invalido ou já vendido.");
        }
    }
    public void sorteio{
        int num = (int(Math.random()*(MAX-MIN +1) + MIN));
        System.out.println("O número soeteado foi: "+num);
        this.num_sorteado = num;
        if(bilhetes[num-1]!=null){
            System.out.println("O gahador foi: "+bilhetes[num-1].getId());
        }
        else{
            System.out.println("Nãi houve ganhador");
        }
    }



//    private List<Integer> numerosDisponiveis = new ArrayList<>();
//
//    public Loteria() {
//        // Cria bilhetes de 1 a 10
//        for (int i = 1; i <= 10; i++) {
//            numerosDisponiveis.add(i);
//        }
//    }
//
//    public int sortearNumero() {
//        Random rand = new Random();
//        return rand.nextInt(10) + 1; // número entre 1 e 10
//    }
}

