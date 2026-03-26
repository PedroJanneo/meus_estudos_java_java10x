package NivelIntermediario.FinalMethodsEClasse;

import NivelIntermediario.PolimorfismoXAbstracao.EstrategiaDeBatalha;

public abstract class Ninja implements EstrategiaDeBatalha {


    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas) {
       this(nome,aldeia,idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;

    }

    final void atacarkunai(){ // ← metodo final, onde a classe filha, vai herdar exatamente o que o metodo faz
        System.out.println("Atacando kunai da classe mae");
    }

    public void habilidadeEspecial(){
        System.out.println("meu nome é " + nome + " e esta é meu ataque especial ");
    }

    @Override
    public void minhaEstrategiabatalha() {
        System.out.println("Eu sou o  " + nome + " este é minha estrategia, completei " + numeroDeMissoesConcluidas + " missoes");
    }


    public void inteligenciaBatalha(){
        System.out.println("Meu nome é " + nome + " e este é minah inteligencia de batalha");
    }

    public void inteligenciaBatalha(int qi){
        System.out.println("Qual seu QI? ");
        if (qi > 150){
            System.out.println("Sou o melhor no campo  de batalha ");
        } else if( qi>=130){
            System.out.println("QI de " + qi + " e sou prmissor");
        } else {
            System.out.println("Preciso estudar mais");
        }
    }
}