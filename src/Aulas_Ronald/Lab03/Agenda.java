package Aulas_Ronald.Lab03;

public class Agenda {
    private Contato[] meusContatos;
    private final int MAX = 100;
    private int total = 0;
    //Construtor:
    public Agenda(){
        meusContatos = new Contato[MAX];
    }
    public boolean ehDuplicado(Contato c) {
        for (int i = 0; i < total; ++i) {
            if (c.getNome().equals(meusContatos[i].getNome()) && c.getTel().equals(meusContatos[i].getTel())) { //Chama o nosso "equals()"!
                return true;
            }
        }
        return false;
    }
    public void listarContatos(){
        for (int i = 0; i < total; ++i) {
            System.out.println(meusContatos[i].getNome());
        }
        System.out.println("Total de " + total + " contatos listados.");
    }
    public boolean adicionarContato(Contato c){
        if(total == MAX) //Agenda lotada?
            return false;
        if (ehDuplicado(c)){
            System.out.println("Contato ja existe na agenda.");
            return false;
        }
        meusContatos[total]=c;
        ++total;
        return true;
    }
    public boolean removerContato(Contato c){
        int index = -1;
        for (int i = 0; i < total; i++){
            if (meusContatos[i].getNome().equals(c.getNome()) && meusContatos[i].getTel().equals(c.getTel())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Contato não encontrado na agenda.");
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            meusContatos[i] = meusContatos[i + 1];
        }
        --total;
        return true;
    }
}