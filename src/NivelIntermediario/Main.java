package NivelIntermediario;

/**
 * <b>PILARES DA ORIENTAÇÃO OBJETO: </b><br>
 * <b> - HERANÇA:</b> usar características de uma classe (vai ser nomeada de classe mae) emm outras classes (chama classes-filhas) para assim poupar código.<br>
 * <b> - POLIMORFISMO:</b> criar uma unica função que pode ser utilizado em diferentes classes com diferentes características.<br>
 * <b> - ENCAPSULAMENTO:</b> capacidade de proteger variáveis e classes para não haver vazamento e mantendo assim protegida e encapsulada os nossos objetos
 */
public class Main {
    public static void main(String[] args) {

        // OBJETO
        Ninja naruto = new Ninja();

        // OBJETO
        Ninja sasuke = new Ninja();

        naruto.nome = "Naruto";
        naruto.idade = 21;
        naruto.aldeia = "Konoha";

        sasuke.nome = "Sasuke";
        sasuke.idade = 21;
        sasuke.aldeia = "Konoha";

        System.out.println("Menu nome é " + naruto.nome + " e tenho " + naruto.idade + " anos, e  sou da Vila " + naruto.aldeia);
        System.out.println("Menu nome é " + sasuke.nome + " e tenho " + sasuke.idade + " anos, e  sou da Vila " + sasuke.aldeia);
//        System.out.println(sasuke.nome);
    }
}
