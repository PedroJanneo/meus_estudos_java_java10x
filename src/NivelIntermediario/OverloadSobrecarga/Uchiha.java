package NivelIntermediario.OverloadSobrecarga;


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

    // sobreescrita da classe ninja
    @Override
    public void inteligenciaBatalha() {
        System.out.println("Meu nome é " + nome + " e este é minah inteligencia de batalha, estilo Uchiha");
    }

    // sobreescrita da classe ninja
    @Override // ← este metodo, vem da classe Ninja, a palavra Override, não é obrigatória estar ali, mas é uma boa prática e ajuda a prevenir erros de digitação.
    public void inteligenciaBatalha(int qi){
        super.inteligenciaBatalha(qi); // ele vai puxar o metodo da classe Ninja
        System.out.println("eu sou uchiha, rexpeitaaaaaaaaa");
    }
}