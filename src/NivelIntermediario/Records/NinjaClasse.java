package NivelIntermediario.Records;

public class NinjaClasse {
    private final String nome;
    private final String email;


    public NinjaClasse(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "NinjaClasse{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
