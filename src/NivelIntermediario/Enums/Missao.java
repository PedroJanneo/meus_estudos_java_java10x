package NivelIntermediario.Enums;

public class Missao {
     String nomeMissao;
     RankMissao rank;

    public Missao(String nomeMissao, RankMissao rank) {
        this.nomeMissao = nomeMissao;
        this.rank = rank;
    }

    public void imprimir(){
        System.out.println("Missão: " + nomeMissao + " Dificuldade: " + rank + " (dificuldade: " + rank.getNivelDificuldade() + " , Nivel de dificuldade:  " + rank.getDificuldade() + " )");
    }
}
