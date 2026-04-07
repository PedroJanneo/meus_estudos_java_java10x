package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        // Dessa forma a Classe Equipamento esta genérica, podemos usar várias vezes para várias situações
        Equipamento kunai = new Equipamento("Kunai");
        Equipamento shuriken = new Equipamento("Shuriken");
        Equipamento pergaminho = new Equipamento("Pergaminho");
        Equipamento atadura = new Equipamento("Atadura");

        Bolsa<Equipamento> bolsaNinja = new Bolsa<>();
        // outra forma de fazer
        Bolsa<Object> bolsaNinja2 = new Bolsa<>();

        bolsaNinja.adicionarItem(kunai);
        bolsaNinja.adicionarItem(shuriken);
        bolsaNinja.adicionarItem(pergaminho);
        bolsaNinja.adicionarItem(atadura);
      // outra forma de criar e ja adicionar na List
        bolsaNinja2.adicionarItem((new Equipamento("Poção de veneno"))); // criando de forma direta, para poluir menos o código

        System.out.println(bolsaNinja);
        System.out.println(bolsaNinja2);
    }
}
