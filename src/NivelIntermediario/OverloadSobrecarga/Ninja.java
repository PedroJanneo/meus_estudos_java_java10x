package NivelIntermediario.OverloadSobrecarga;

import NivelIntermediario.PolimorfismoXAbstracao.EstrategiaDeBatalha;

public abstract class Ninja implements EstrategiaDeBatalha {


    // TODO: INCLUIR 2 NOVOS ATRIBUTOS: numeroDeMissoesConcluidas e Rank

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rankNinja;


    // Construtor Vazio
    public Ninja() {
    }

    // Construtor 1 (básico, feito com os primeiros atributos enviados)
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Estamos fazendo a Sobrecarga do construtor, já existia um construtor, mas não pegava todos os atributos, eles foram criados depois
    // Então criamos outro construtor, adicionando os 2 novos atributos.
    // Construtor 2, com os novos atributos e os anteriores
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rankNinja) {
       this(nome,aldeia,idade); // estou me referindo ao construtor de cima (linha 21)
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas; // atributo novo
        this.rankNinja = rankNinja; // atributo novo
    }

    public void habilidadeEspecial(){
        System.out.println("meu nome é " + nome + " e esta é meu ataque especial ");
    }

    // sobescrita do metodo na interface
    @Override
    public void minhaEstrategiabatalha() {
        System.out.println("Eu sou o  " + nome + " este é minha estrategia, completei " + numeroDeMissoesConcluidas + " missoes");
    }

    // 1º metodo
    public void inteligenciaBatalha(){
        System.out.println("Meu nome é " + nome + " e este é minah inteligencia de batalha");
    }

    //Sobrecarga de metodo ( do metodo da linha 48)
    // nome do metodo exatamente igual, o que muda é o seu parâmetro
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