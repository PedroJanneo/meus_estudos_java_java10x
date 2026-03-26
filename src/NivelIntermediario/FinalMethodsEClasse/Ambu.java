package NivelIntermediario.FinalMethodsEClasse;

// usamos final numa classe, quando não queremos que ela seja herdada
final class Ambu {

    // Não é porque a Classe é final, que seus atributos e métodos também são, pelo contrário, eles podem ser ou não
    String nome;
    final double altura = 1.70;

    public void anbu(){
        System.out.println("Eu sou um ambu");
    }
    final void ambu2(){
        System.out.println("Ambu final");
    }
}
