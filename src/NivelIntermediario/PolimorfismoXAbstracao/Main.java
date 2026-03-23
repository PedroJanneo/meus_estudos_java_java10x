package NivelIntermediario.PolimorfismoXAbstracao;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "sasuke";
        sasuke.minhaEstrategiabatalha();
        sasuke.ataqueEspecial();


        Uchiha itachi = new Uchiha("Itachi","Folha",21);
        itachi.minhaEstrategiabatalha();
        itachi.ataqueEspecial();
    }
}
