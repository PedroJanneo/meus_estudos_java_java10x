package NivelIntermediario.ReferenciaMemoria;


import NivelIntermediario.OverloadSobrecarga.NivelNinja;

public class Main {
    public static void main(String[] args) {

        System.out.println("Com toString");
       Uchiha sasuke = new Uchiha("Sasuke","Folha",21,5);
        System.out.println(sasuke); // sasuke tem o metódo toString, ele vai "printar" tudo que estiver dentro do toString

        System.out.println("-------------------------");
        System.out.println("Sem toString");
        Uzumaki naruto = new Uzumaki("Naruto","Folha",21,5);
        System.out.println(naruto); // como naruto não tem toString, teria que colocar System.out.println(naruto.nome) para todos outros atributos




    }
}
