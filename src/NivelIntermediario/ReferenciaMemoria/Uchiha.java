package NivelIntermediario.ReferenciaMemoria;


import NivelIntermediario.OverloadSobrecarga.NivelNinja;

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



    @Override
   public String toString() { // ← toString serve para 'printar' texto, sem ele, quando usamos o sout sem o toString, ele só vai mostrar a referência de memória
        return "Meu " +
                "nome é '" + nome + '\'' +
                ", sou da aldeia '" + aldeia + '\'' +
                ", minha idade é " + idade +
                ", e tenho " + numeroDeMissoesConcluidas +
                " missoes completadas";
    }

}