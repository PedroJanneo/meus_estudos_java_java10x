package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroNinjas = 2;
        int ninjasCadastrados = 0;
        String[] ninjas = new String[numeroNinjas];
        int escolha = 0;


        while( escolha != 3){
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        escolha = sc.nextInt();
        sc.nextLine();



    switch (escolha){
        case 1:
                if(ninjasCadastrados < numeroNinjas){
                    System.out.println("Escreva o nome do ninja que deseja cadastrar: ");
                    String nomeNinja = sc.nextLine();
                    ninjas[ninjasCadastrados] = nomeNinja;
                    ninjasCadastrados++; // ira aumentar conforme for cadastrando os ninjas
                    System.out.println("Nnja cadastrado com sucesso");

                } else {
                    System.out.println("Lista cheia");
                }
            break;
        case 2:
            if(ninjasCadastrados == 0){
                System.out.println("Sem ninjas");
            } else {
                System.out.println("==========================");
                System.out.println("Listando ninjas: ");
                for (int i = 0; i < ninjas.length; i++) {
                    System.out.println(i +" - " + ninjas[i]);

                }
            }
            break;
        case 3:
            System.out.println("Saindo do menu... Volte logo");
            break;
        default:
            System.out.println("Opção inválida");

    }
}

    }
}
