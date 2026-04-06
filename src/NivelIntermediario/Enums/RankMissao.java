package NivelIntermediario.Enums;

public enum RankMissao {

    A("Muito facil",1),
    B("facil",2),
    C("Moderaado",5),
    D("Dificil",10);

    private String nivelDificuldade;
    private int dificuldade;

    RankMissao(String nivelDificuldade, int dificuldade) {
        this.nivelDificuldade = nivelDificuldade;
        this.dificuldade = dificuldade;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
