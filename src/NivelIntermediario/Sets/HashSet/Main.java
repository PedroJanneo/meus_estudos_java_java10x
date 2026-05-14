package NivelIntermediario.Sets.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("A");
        ninjas.add("C");
        ninjas.add("B");
        ninjas.add("B");
        System.out.println("Ninjas Array = " + ninjas);

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas); // adicionando a listas ninjas na HashSet
        System.out.println("Ninjas SET = " + ninjasSet);

        Set<String> ninjaTree = new TreeSet<>();
        ninjaTree.addAll(ninjas); // adicionando a listas ninjas na TreeSet
        System.out.println("Ninjas Tree = " + ninjaTree);
    }
}
