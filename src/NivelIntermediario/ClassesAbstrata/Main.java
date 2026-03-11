package NivelIntermediario.ClassesAbstrata;

public class Main {
    public static void main(String[] args) {

        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama";
        hashirama.idade = 24;
        hashirama.Sabedoria();

        // Classe Hokage virou classe abstrata ( impedindo de ser instanciada)
//        Hokage tobirama = new Hokage();
//        tobirama.nome = "Tobirama";
    }
}
