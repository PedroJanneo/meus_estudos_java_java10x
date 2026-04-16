package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // Estaticos
        String[] array = new String[3];
        array[0] = "Naruto";

        //List
        // Mais maleaveis
        List<String> list = new ArrayList<>();
        list.add("Naruto");

        // Stack
        // ultimo elemento que entrar é obrigado a ser o primeiro a sair
        Stack<String> stack = new Stack<>();
        stack.push("Naruto");
        stack.push("Sasuke");
        stack.push("Sakura");
        System.out.println(stack.size());
        System.out.println(stack.peek()); // printou Sakura
        System.out.println(stack); // printando a lista inteira
        stack.pop(); // removi o ultimo atributo adicionado ( neste caso, sakura)
        System.out.println(stack.peek()); // printou Sasuke
        System.out.println(stack.size());
        System.out.println(stack);
    }
}
