package NivelIntermediario.EstruturaDados.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // array normal
        String[] ninjaArray = new String[3];
        ninjaArray[0] = "Naruto"; // adicionando na array
        ninjaArray[1] = "Minato";
        ninjaArray[2] = "Kushina";

        // tendo que mostrar qual indice vc quer imprimir, se nao falar o indice, ele 'imprimira' o endereço de memoria
        System.out.println(ninjaArray[1]);



        // List
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Itachi"); // adicionando na List
        ninjaList.add("Sasuke");
        ninjaList.add("kakashi");

        // ele imprirmi a List inteira
        System.out.println( ninjaList);
        ninjaList.remove("kakashi"); // removendo do List ( podendo ou colocar o nome do objeto ou o indice)
        System.out.println(ninjaList);

        ninjaList.set(0,"Hashirama"); // trocamos o valor do indice 0 (Itachi) pelo valor novo (Hashirama)
        System.out.println(ninjaList);

        System.out.println(ninjaList.size()); // vendo o tamanho da List
    }
}
