package NivelIntermediario.EstruturaDados.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // inicializando uma Queue (Fila)
        Queue<String> ninjaQueue = new LinkedList<String>();
        ninjaQueue.add("Sasuke Uchiha"); // adicionando
        ninjaQueue.add("Itachi Uchiha");
        ninjaQueue.add("Madara Uchiha");
        System.out.println(ninjaQueue.peek()); // mostar o item que esta no HEad (primeiro)
        System.out.println(ninjaQueue);
        System.out.println("Removendo o " + ninjaQueue.poll());  // removendo o primeiro item adicionado

        System.out.println(ninjaQueue); // printando a fila
        System.out.println(ninjaQueue.peek()); // mostar o item que esta no HEad (primeiro)

        // vereficar se esta vazia
        System.out.println(ninjaQueue.isEmpty());



    }
}
