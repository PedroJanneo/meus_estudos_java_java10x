package TipoDados;



// DADOS PRIMITIVOS : são dados que de maneira geral não recebem metodos de maneira padrão
// DADOS NAO PRIMITIVOS: são o tipo de dados que pode-se colocar metodos para fazer alteracoes na variavel sem que seja mudadp o escopo
public class DadosNaoPrimitivos {
    public static void main(String[] args) {


        String name = "Pedro";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameUpperCase);
        System.out.println(nameLowerCase);

    }
}
