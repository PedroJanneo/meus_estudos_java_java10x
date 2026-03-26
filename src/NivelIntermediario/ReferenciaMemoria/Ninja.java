package NivelIntermediario.ReferenciaMemoria;

import NivelIntermediario.OverloadSobrecarga.NivelNinja;
import NivelIntermediario.PolimorfismoXAbstracao.EstrategiaDeBatalha;

public abstract class Ninja {



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



}