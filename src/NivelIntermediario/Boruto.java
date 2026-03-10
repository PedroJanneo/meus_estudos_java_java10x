package NivelIntermediario;

public class Boruto extends ClaUzumaki implements  HyugaUzumaki{

    public void AtivarKarma(){
        System.out.println("Eu sou descedente Uzumaki e Hyuga ");
    }

    @Override
    public void AtivarJougan() {
        System.out.println("Jougan ativado! ");
    }

    @Override
    public void AtacarComChakara(String tipo) {
        System.out.println("Usando o " + tipo + " no meu ataque");
    }
}
