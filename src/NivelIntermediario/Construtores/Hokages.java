package NivelIntermediario.Construtores;

/**
 * <b>NoArgs Constructor: </b> um construtor que vem vazio, não precisa receber argumento <br>
 * <b>AllArgs Constructor: </b> um construtor que é preenchido com todos os atributos da classe
 */

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    // NoArgs Constructor
    public Hokages() {
        // construtor sem argumento (por padrão, ele ja vem escondido)
    }

    // construtor com argumento nome
    public Hokages(String nome) {
        this.nome = nome; // this.nome se refere ao nome da linha 4 / e o nome (depois do =) se refere ao argumento vindo na linah 13

    }
    // construtor com argumento idade
    public Hokages(int idade) {
        this.idade = idade; // this.idade se refere ao nome da linha 5 / e o idade (depois do =) se refere ao argumento vindo na linah 18
    }

    // Construtor AllArgs Constructor ( todos argumentos)
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}


