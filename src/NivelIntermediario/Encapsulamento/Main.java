package NivelIntermediario.Encapsulamento;



public class Main {
    public static void main(String[] args) {

        System.out.println("----------------Sasuke--------------------------");
        Uchiha sasuke = new Uchiha("Sasuke","Folha",21,3);
        System.out.println(sasuke.getAldeia()); // printando Aldeia que foi cadastrado no construtor (linha 9)
        sasuke.setAldeia("Konoha"); // setando um novo nome para Aldeia
        System.out.println(sasuke.getAldeia()); // printando o novo Aldeia que foi cadastrado anteriormente (linha 11)
    }
}
