package NivelIntermediario.HerancaMultipla;



public class Hatake extends Ninja implements Sharingan, Anbu, Hokage {

    public void boasVindas() {
        System.out.println(nome + " e sou um hatake");
    }

    // Metódo vindo direto da Interface Sharingan
    @Override
    public void sharinganAtivado(){
        System.out.println(nome + " ativei meu sharingan ");
    }

    @Override
    public void ninaElite() {
        System.out.println("Sou da elite Ninja Anbu");
    }

    public void souHokage(){
        System.out.println("Eu sou um Hokage");

    }
}

