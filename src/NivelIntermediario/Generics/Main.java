package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        // Dessa forma a Classe Equipamento esta genérica, podemos usar várias vezes para várias situações
        Equipamento kunai = new Equipamento("Kunai");
        Equipamento shuriken = new Equipamento("Shuriken");
        Equipamento pergaminho = new Equipamento("Pergaminho");
        Equipamento atadura = new Equipamento("Atadura");

        Bolsa<Equipamento> bolsaNinja = new Bolsa<>();

        bolsaNinja.adicionarItem(kunai);
        bolsaNinja.adicionarItem(shuriken);
        bolsaNinja.adicionarItem(pergaminho);
        bolsaNinja.adicionarItem(atadura);

        System.out.println(bolsaNinja);
    }
}
