package NivelIntermediario.FinalMethodsEClasse;


public class Uchiha extends Ninja {


    public Uchiha() {
        super();
    }


    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }


    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas);
    }

    public void meuAtaque(){
        System.out.println("Sharingan");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Eu sou " + nome + " e usei bola de fogo e shurikens ");
    }


    @Override
    public void inteligenciaBatalha() {
        System.out.println("Meu nome é " + nome + " e este é minah inteligencia de batalha, estilo Uchiha");
    }

    @Override
    public void inteligenciaBatalha(int qi){
        super.inteligenciaBatalha(qi);
        System.out.println("eu sou uchiha, rexpeitaaaaaaaaa");
    }


}