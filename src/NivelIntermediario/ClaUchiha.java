package NivelIntermediario;

/** Principio da herança, onde a classe 'ClaUchiha' recebe todos os atributos da classe 'Ninja' através da palavra extends
 * <br>
 *
 *  * Classe criada para apenas quem for do ClaUchiha ( da Classe) ter acesso ao metodo SharinganAtivado
  */

public class ClaUchiha extends Ninja{

    /*
MEOTODO VOID NAO RETORNA VALOR
 */
    public void SharinganAtivado(){
        System.out.println("Sharingan ativado!");
    }
}
