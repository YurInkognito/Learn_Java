package Lab03;

public class Contato {
    private String nome;
    private String tel;
    //Método construtor:
    public Contato(String nome, String tel){
    //Note que o 'this' é necessário aqui!
        if(nome == null || nome.trim().isEmpty()){
            this.nome = "Anonimo";
        }else{
            this.nome = nome;
        }
        this.tel = tel;
    }
    @Override
    public boolean equals(Object obj){ //Criaremos nossa definição de "igualdade"
        if(obj == this) // comparação de referência!
            return false; //Isso mesmo, falso! Entende o motivo?
        if(!(obj instanceof Contato)) //"Se obj *NÃO* é da classe Contato, então...
            return false; //...obviamente.
        Contato c = (Contato)obj; //Converte o objeto genérico obj para o tipo Contato.
//A classe String tb herda de Object, daí tb tem seu próprio "equals()"!
        return this.nome.equals(c.getNome());
    }
    public String getNome(){
        return nome; //O mesmo que "return this.nome"
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
}