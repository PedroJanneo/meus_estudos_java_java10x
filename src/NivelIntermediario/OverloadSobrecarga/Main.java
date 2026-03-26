package NivelIntermediario.OverloadSobrecarga;


public class Main {
    public static void main(String[] args) {


        // Teste Uchiha 1 ( Construtor vazio)
       Uchiha sasuke = new Uchiha();
       sasuke.nome = "Sasuke";
       sasuke.idade = 21;
       sasuke.aldeia = "Folha";
       sasuke.numeroDeMissoesConcluidas = 4;
       sasuke.rankNinja = NivelNinja.GENIN; // NivelNinja →  ENUM
                                            // GENIN → Atributo/valor dentro do ENUM NivelNinja
        sasuke.minhaEstrategiabatalha();
        sasuke.ataqueEspecial();
        System.out.println("------------------------");

        // Teste uchiha 2 ( antigo construtor)
        Uchiha madara = new Uchiha("Madara","Folha",21);
        madara.ataqueEspecial();
        madara.minhaEstrategiabatalha();
        System.out.println("------------------------");

       // Teste Uchiha 3 (novo Construtor)
        Uchiha itachi = new Uchiha("Itachi","Konoha",24,15, NivelNinja.GENIN);
        itachi.ataqueEspecial();
        itachi.minhaEstrategiabatalha();
        itachi.inteligenciaBatalha(); // metodo 1
        itachi.inteligenciaBatalha(980); // metodo Sobrecarregado

        System.out.println("------------------------------------");
        // Refatorando
        Uzumaki naruto = new Uzumaki("Naruto","Konoha",21, Biju.KURAMA);
        System.out.println(naruto);


    }
}
