package Condicoes;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variavel = condicao ? valorSeVErdadeiro : valorSeFalso
        // ele é basicamente um IF else resumido

        int age = 18>20 ? 21:90;
        System.out.println(age);

        // testando se aceita variavel
        System.out.println("Digite sua idade ");
        int age2 = sc.nextInt();
        String maiorIdade = age2>=18 ? "Maior de idade" : "Menor de idade";
        System.out.println(maiorIdade);

        int numeroDeMissoes = 21;
        String nivel = (numeroDeMissoes>=10) ?  "Este ninja tem mais de 10 missoes" : "Este ninja tem menos que 10 missoes";
        System.out.println(nivel);


        sc.close();
    }
}
