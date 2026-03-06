package NivelIntermediario.Desafios;

public class Uchiha extends  Ninja{
    public String habilidadeEspecial;

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Vou usar minha habilidade especial " + habilidadeEspecial);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Vou usar minha habilidade especial " + habilidadeEspecial);
    }
}
