package NivelIntermediario.PolimorfismoXAbstracao;

public class Uchiha extends Ninja {

    public Uchiha() {
        super(); // Estou me referenciando ao um elemento da superclasse (Classe Ninja). neste caso, me estou me referindo ao construtor da classe Ninja
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); // Estou me referenciando ao um elemento da superclasse (Classe Ninja). neste caso, me estou me referindo ao construtor da classe Ninja
    }

    public void meuAtaque(){
        System.out.println("Sharingan");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Bola de fogo e shurikens ");
    }
}
