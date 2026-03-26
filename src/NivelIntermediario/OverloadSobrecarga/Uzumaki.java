package NivelIntermediario.OverloadSobrecarga;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rankNinja, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rankNinja);
        this.biju = biju;
    }

    public Uzumaki(String nome, String aldeia, int idade, Biju biju) {
        super(nome, aldeia, idade);
        this.biju = biju;
    }


    @Override
    public void ataqueEspecial() {
        System.out.println("Neu ataque Uzumaki");
    }

    @Override
    public String toString() {
        return "Uzumaki{" +
                "nome da biju=" + biju + " caldas: " + biju.caldas +
                ", nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                ", numeroDeMissoesConcluidas=" + numeroDeMissoesConcluidas +
                ", rankNinja=" + rankNinja +
                '}';
    }
}
