package NivelIntermediario.Desafios.Desafio4;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade principal é " + habilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Me chamo " + nome + " tenho " + idade + " anos. Minha especialidade é " + especialidade);
    }
}
