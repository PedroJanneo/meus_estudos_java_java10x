package NivelIntermediario.OverloadSobrecargaConstrutores;


public class Uchiha extends Ninja {

    // Construtor vazio
    public Uchiha() {
        super(); // Estou me referenciando ao um elemento da superclasse (Classe Ninja). neste caso, me estou me referindo ao construtor da classe Ninja
    }

    // Construtor 1 (básico, feito com os primeiros atributos enviados)
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); // Estou me referenciando ao um elemento da superclasse (Classe Ninja). neste caso, me estou me referindo ao construtor da classe Ninja
    }

    // Estamos fazendo a Sobrecarga do construtor, já existia um construtor, mas não pegava todos os atributos, eles foram criados depois
    // Então criamos outro construtor, adicionando os 2 novos atributos.
    // Construtor 2, com os novos atributos e os anteriores
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rankNinja) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rankNinja); // Estou me referenciando ao um elemento da superclasse (Classe Ninja). neste caso, me estou me referindo ao construtor da classe Ninja
    }

    public void meuAtaque(){
        System.out.println("Sharingan");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Eu sou " + nome + " e usei bola de fogo e shurikens ");
    }
}