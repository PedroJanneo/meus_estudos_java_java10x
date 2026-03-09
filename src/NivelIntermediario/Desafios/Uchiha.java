package NivelIntermediario.Desafios;

public class Uchiha extends  Ninja{
    public String habilidadeEspecial;

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        if ( habilidadeEspecial == null){
            System.out.println("Não tenho nenhuma habilidade especial ainda");
        } else{
            System.out.println("Vou usar minha habilidade especial " + habilidadeEspecial);
        }

    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Sinta a minha habilidade:  " + habilidadeEspecial);
    }
}
