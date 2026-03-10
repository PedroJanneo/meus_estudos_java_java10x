package NivelIntermediario;

/**
 * <b>Interfaces:</b> são como moldes/contratos.
 * Nelas declaramos métodos (sem implementação/corpo do metodo).
 * Elas definem o que uma classe deve fazer.
 *<br>
 * <b>Classes:</b> implementam as interfaces, ou seja,
 * transformam o molde em algo específico,
 * escrevendo a lógica dos métodos (corpo).
 * <br>
 * <b>RESUMIDO:</b><BR>
 *     Interface define oque deve existir.<br>
 *     Classe faz acontecer
 */
public interface HyugaUzumaki {


    void AtivarKarma(); // interface é so uma janela, só olhamos e pegamos algo; não colocamos nada nos metodos da interface.

    void AtivarJougan();

    void AtacarComChakara(String tipo);
}
