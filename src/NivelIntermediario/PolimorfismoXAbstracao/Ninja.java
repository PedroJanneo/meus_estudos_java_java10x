package NivelIntermediario.PolimorfismoXAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    public void habilidadeEspecial(){
        System.out.println("meu nome é " + nome + " e esta é meu ataque especial ");
    }

    // sobescrita do metodo na interface
    @Override
    public void minhaEstrategiabatalha() {
        System.out.println("este é minha estrategia");
    }
}
