package exercicio.poo09;

public class Cachorro extends Animal {


    public Cachorro(){
    }
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    public void deveCorrer(){
        System.out.println("Cachorro correndo!");
    }
    public void emitirSom(){
        System.out.println("Auau");
    }
}
