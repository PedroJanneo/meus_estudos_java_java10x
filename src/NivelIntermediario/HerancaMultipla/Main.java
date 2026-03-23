package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {


        Uchiha sasuke = new Uchiha();
        sasuke.nome  = "Sasuke";
        sasuke.idade = 19;
        sasuke.aldeia = "Folha";
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.aldeia = "Folha";
        kakashi.idade = 49;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninaElite();
        kakashi.souHokage();
    }
}
