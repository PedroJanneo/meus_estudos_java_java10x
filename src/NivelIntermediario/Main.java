package NivelIntermediario;

/**
 * <b>PILARES DA ORIENTAÇÃO OBJETO: </b><br><br>
 * <b> - HERANÇA:</b> usar características de uma classe (vai ser nomeada de classe mae) emm outras classes (chama classes-filhas) para assim poupar código.<br><br>
 * <b> - POLIMORFISMO:</b> criar uma unica função que pode ser utilizado em diferentes classes com diferentes características.<br><br>
 * <b> - ENCAPSULAMENTO:</b> capacidade de proteger variáveis e classes para não haver vazamento e mantendo assim protegida e encapsulada os nossos objetos
 */

public class Main {
    public static void main(String[] args) {

        // OBJETO
        ClaUzumaki naruto = new ClaUzumaki();

        // OBJETO
//        Ninja sasuke = new Ninja();
        ClaUchiha sasuke = new ClaUchiha();

        naruto.nome = "Naruto";
        naruto.idade = 21;
        naruto.aldeia = "Konoha";
        naruto.ModoSabio();


        sasuke.nome = "Sasuke";
        sasuke.idade = 21;
        sasuke.aldeia = "Konoha";

        ClaHaruno sakura = new ClaHaruno();
        sakura.nome = "Sakura";
        sakura.idade = 25;
        sakura.aldeia = "Konoha";
        sakura.AtivarCura();

        sasuke.SharinganAtivado();

        System.out.println("Menu nome é " + naruto.nome + " e tenho " + naruto.idade + " anos, e  sou da Vila " + naruto.aldeia);
        System.out.println("Menu nome é " + sasuke.nome + " e tenho " + sasuke.idade + " anos, e  sou da Vila " + sasuke.aldeia);
        System.out.println("Menu nome é " + sakura.nome + " e tenho " + sakura.idade + " anos, e  sou da Vila " + sakura.aldeia);
        String chamandoMetodo = sasuke.euSouUmNinja(); // atribuindo o metodo poder para uma variável
        int chamandoMetodoNovo = sasuke.anosParaSerHokage(70);
        System.out.println(chamandoMetodo); // Chamando a função euSouUmNinja, para parecer via terminal
        System.out.println(chamandoMetodoNovo); // Chamando a função anosParaHokage. para parecer via terminal
    }
}
