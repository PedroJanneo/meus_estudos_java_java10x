package NivelIntermediario.PolimorfismoXAbstracao;

public class Uchiha extends Ninja {


    public void meuAtaque(){
        System.out.println("Sharingan");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Bola de fogo e shurikens ");
    }
}
