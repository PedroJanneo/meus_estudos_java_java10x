package NivelIntermediario.EstruturaDados.Arrays;

import java.util.Scanner;

// array -> sempre vai ter um tipo definido e tamanho definido
// lista -> tamanhos flexiveis

/*  VALORES PADRAO
    String -> null
    int -> 0
    boolean -> false
    flutuante -> 0.0
 */
public class Arrays {
    public static void main(String[] args) {

        // struct arrays
        // array são tipo referencia
        String[] ninjas = new String[3];
        // [3] -> numero da memoria do array
        ninjas[0] = "Naruto";
        ninjas[1] = "Kakashi";
        ninjas[2] = "Itachi";

        // dessa forma a array antiga( linha 19)  chamada 'ninjas' deixa de existir, e todos seus dados são jogados no 'lixo' ( chamamos isso de Garbage Collecttor)
        ninjas = new String[4];

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("Teste: " + ninjas[i]);
        }


        // Teste para ver se o Scanner consegue interagir com a Array
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] teste = new int[i];

        for (int j = 0; j < teste.length; j++) {
            teste[j] = j;
            System.out.println("Teste: " + teste[j]);
        }
        sc.close();


    }
}