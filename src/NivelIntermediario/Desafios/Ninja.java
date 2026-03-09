package NivelIntermediario.Desafios;

public class Ninja {
    public String nome;
    public int idade;
    public String missao;
    public String nivelDificuldade;
    public String statusMissao;


    public void mostrarInformacoes(){

        if ( missao == null && statusMissao == null){
            System.out.println("Me chamo " + nome + " e tenho " + idade + " anos");
        } else{
            System.out.println("Me chamo " + nome + " e tenho " + idade + " anos,Estou fazendo a missao " + missao + " que possui a dificuldade " + nivelDificuldade + " e atualmente ela está " + statusMissao);
        }


    }
}
