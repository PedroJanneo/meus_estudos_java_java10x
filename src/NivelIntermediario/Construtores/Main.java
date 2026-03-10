package NivelIntermediario.Construtores;


public class Main {
    public static void main(String[] args) {

        Hokages Hashirama = new Hokages();
        Hashirama.idade = 33;

        Hokages tobirama = new Hokages("Tobirama");
        System.out.println(tobirama.nome);

        Hokages hiruzen = new Hokages(65);
        System.out.println(hiruzen.idade);

        Hokages minato = new Hokages("Minato",32,false);
        System.out.println(minato.nome);
        System.out.println(minato.idade);
        System.out.println(minato.vivoOuNao);
    }
}
