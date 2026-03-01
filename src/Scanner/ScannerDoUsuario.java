package Scanner;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        // struct do Scanner
        Scanner sc = new Scanner(System.in);
        // Scanner pega tudo  que for digitado via terminal, permitindo o usuario interagir

        System.out.println("Escreva seu nome ");
        String name = sc.nextLine();

        System.out.println("Qual sua idade ");
        short age = sc.nextShort();

        System.out.println("Meu nome é " + name);
        System.out.println("Minha idade é " + age);

        if (age >= 18){
            System.out.println("Maior de idade !!");
        } else {
            System.out.println("Menor de idade ");
        }
         // close in Scanner
        sc.close();

    }
}
