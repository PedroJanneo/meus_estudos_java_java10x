package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{

    @Override // chamado de anotação / usado para sobrescrever um metodo (Polimorfismo)
    public void habilidadeEspecial() {
        System.out.println("meu nome é " + nome + " e este é meu ataque Uchiha, ataque tipo fogo");
    }
}
