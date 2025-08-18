package Aulas_Mitre.Loteria;

public class Pessoa {

    private int id;
    private int bilhete;
    public Pessoa(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setBilhete(int num){
        this.bilhete = num;
    }
    public int getBilhete(){
        return this.bilhete;
    }


//    private int id;
//    private int bilhete; // número do bilhete comprado
//
//    public Pessoa(int id) {
//        this.id = id;
//    }
//
//    public void comprarBilhete(int numero) {
//        this.bilhete = numero;
//    }
//
//    public int getBilhete() {
//        return bilhete;
//    }
//
//    public int getId() {
//        return id;
//    }
}
