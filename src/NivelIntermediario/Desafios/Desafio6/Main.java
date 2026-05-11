package NivelIntermediario.Desafios.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listaNinja = new LinkedList<>();

        Ninja ninja1 = new Ninja("N1",21,"Folha");
        Ninja ninja2 = new Ninja("N2",21,"Folha");
        Ninja ninja3 = new Ninja("N3",21,"Folha");
        Ninja ninja4 = new Ninja("N4",21,"Folha");
        Ninja ninja5 = new Ninja("N5",21,"Folha");
        Ninja ninja6 = new Ninja("N6",21,"Folha");
        Ninja ninja7 = new Ninja("N7",21,"Folha");

        listaNinja.add(ninja1);
        listaNinja.add(ninja2);
        listaNinja.add(ninja3);
        listaNinja.add(ninja4);
        listaNinja.add(ninja5);
        listaNinja.add(ninja6);
        listaNinja.add(ninja7);
        int escolha = 0;
//        System.out.println(listaNinja);

        Scanner sc = new Scanner(System.in);

        while(escolha != 5){
            System.out.println("Bem vindo ao menu Ninja, escolha uma opção: ");
            System.out.println("1 - Adicionar Ninja");
            System.out.println("2 - Remover Ninja da sua escolha");
            System.out.println("3 - Remover primeiro Ninja da lista");
            System.out.println("4 - Listar Ninja");
            System.out.println("5 - Sair");
            System.out.println("Faça sua escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch(escolha){
                case 1:
                    System.out.println("Deseja adicionar um novo ninja?: ");
                    System.out.println("Nome do ninja? ");
                    String nome = sc.next();
                    System.out.println("Idade do ninja: ");
                    int idade = sc.nextInt();
                    System.out.println("Qual a aldeia do ninja? ");
                    String ald = sc.next();
                    Ninja ninjaNovo = new Ninja(nome,idade,ald);
                    listaNinja.add(ninjaNovo);
                    break;
                case 2:
                    System.out.println("Vamos remover um ninja ");
                    System.out.println("Qual ninja você deseja remover? ( diga o nome dele)");
                    String ninjaRemovido = sc.nextLine();

                    for(int i = 0; i < listaNinja.size(); i++){
                      String nomeNinjaAtual = listaNinja.get(i).nome();
                        if ( ninjaRemovido.equals(nomeNinjaAtual)) {
                            listaNinja.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Removendo a primeira lista...");
                    listaNinja.removeFirst();
                    break;
                case 4:
                    System.out.println("Vamos listar os ninjas cadastrados...");
                    System.out.println(listaNinja);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }
    }
}
