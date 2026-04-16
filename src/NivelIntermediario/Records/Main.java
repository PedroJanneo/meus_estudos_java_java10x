package NivelIntermediario.Records;



public class Main {
    public static void main(String[] args) {

        NinjaClasse classe = new NinjaClasse("Naruto","naruo@email.com");
        System.out.println(classe); // para classe, precisamos criar O Construtor, GETTERs e o toString
        System.out.println(classe.getNome()); // para acessar o atributo nome, precisamos acessar o getNome

        NinjaRecord record = new NinjaRecord("Sasuke","sasuke@email.com");
        System.out.println(record); // o record, pelo contrário, ja cria todos automaticos
        System.out.println(record.nome()); // para acessar seu atributo, acessamos direto

        System.out.println(record.maisuculoEmail(record.email())); // conseguimos criar metodos normal no record

    }
}
