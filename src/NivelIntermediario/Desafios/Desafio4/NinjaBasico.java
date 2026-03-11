package NivelIntermediario.Desafios.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    String habilidade;
    int idade;

    public NinjaBasico(String nome, String habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Sou o " + nome + " e tenho " + idade + " anos" );
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade especial é : " + habilidade);
    }
}
