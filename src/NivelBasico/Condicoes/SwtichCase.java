package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwtichCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem ");
        System.out.println("1 - Luffy");
        System.out.println("2 - Zoro");
        System.out.println("3 - Sanji");

        int escolhaUser = sc.nextInt();

        System.out.println("Sua escolha foi: " + escolhaUser);

        switch (escolhaUser){
            case 1:
                System.out.println("Escolheu o Luffy, melhor protagonista");
                break;
            case 2:
                System.out.println("Escolheu o Zoro, melhor personagem");
                break;
            case 3:
                System.out.println("Escolheu o Sanji, cozinheiro");
                break;
            default:
                System.out.println("Escolha invalida");
        }

        sc.close();
    }
}
