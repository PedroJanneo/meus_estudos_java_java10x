package NivelIntermediario.Encapsulamento;

public abstract class Ninja  {


    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    // usamos GET para tirar dados ou mostrar para o usuário
    public String getNome() {
        return nome;
    }

    // usamos SET para receber valor
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int Idade){
        this.idade = idade;
    }

    public String getaldeia(){
        return aldeia;
    }

    public void setAldeia(String aldeia){
        this.aldeia = aldeia;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }
}