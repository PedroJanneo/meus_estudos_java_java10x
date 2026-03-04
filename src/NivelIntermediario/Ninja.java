package NivelIntermediario;

import java.text.BreakIterator;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    /*
    MEOTODO STRING RETORNA STRING ( TEXTO)
     */
    public String euSouUmNinja(){
        return "Olá eu sou um ninja";
    }

    /*
    METODO INT RETORNA INT (NUMERO)
     */
    public int anosParaSerHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
