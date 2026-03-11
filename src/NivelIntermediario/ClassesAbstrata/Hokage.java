package NivelIntermediario.ClassesAbstrata;

/**
 * <b>Virou classe abstrata:</b><br>
 * - Classes abstratas não podem ser instanciadas (Hokage tobirama = new Hokage())<br>
 * - São usadas como classes base para outras classes herdarem<br>
 * - Métodos abstratos não podem ter corpo (linha 17) <br>
 * - Classe abstrata é uma classe base que não pode ser instanciada
 *   e serve para outras classes herdarem comportamento e estrutura.
 */
public abstract class Hokage {
    String nome;
    int idade;
    String aldeia;

    // metodo abstrato (seu corpo, é definido onde esta sendo chamado (Senju)
    public abstract void Sabedoria();


    public Hokage() {
    }

    public Hokage(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
}
