package NivelIntermediario.Desafios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Uchiha ninja1 = new Uchiha();

        Scanner sc = new Scanner(System.in);

        ninja1.nome = "Peu";
        ninja1.idade = 21;
        ninja1.statusMissao = "em andamento";
        ninja1.nivelDificuldade = " Rank A";
        ninja1.missao = " buscar o Hoake";
        ninja1.habilidadeEspecial = " Amaterasu!";

        ninja1.mostrarInformacoes();
        ninja1.mostrarHabilidadeEspecial();

        int contador = 0;
        int ninjasCadastrados = 0;
        int ninjasMaximo= 2;
        Uchiha[] ninjas = new Uchiha[ninjasMaximo];

        while( contador != 4){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Mudar Habilidade");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            contador = sc.nextInt();
            sc.nextLine();

            switch (contador){
                case 1:
                    if(ninjasCadastrados < ninjasMaximo){
                        Uchiha novoNinja = new Uchiha();
                        System.out.println("Escreve nome do ninja: ");
                        novoNinja.nome = sc.nextLine();
                        System.out.println("Idade do ninja? ");
                        novoNinja.idade = sc.nextInt();
                        ninjas[ninjasCadastrados] = novoNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastradi com sucesso ");



                    } else{
                        System.out.println("A lista ja esta cheia");
                    }
                    break;
                case 2:
                    if(ninjasCadastrados == 0){
                        System.out.println("Sem ninjas");
                    } else {
                        System.out.println("===========");
                        System.out.println("Lista ninjas: ");
                        for (int i = 0; i < ninjas.length; i++) {
                            ninjas[i].mostrarInformacoes(); // inves de dar System.out.println, usamos a funcao mostrarInformacoes
                        }
                    }
                    break;
                case 3:
                    if (ninjasCadastrados == 0){
                        System.out.println("Sem ninjas aqui..");
                    } else{                                                         // ninjaascadastrados - 1 -> para ficar coerente, pois o Array, começa do 0
                        System.out.println("Digite o numero (ID) do ninja ( de 0 a " + (ninjasCadastrados - 1) + " )");
                        int idNinja = sc.nextInt();
                        sc.nextLine();

                        if (idNinja >=0 && idNinja < ninjasCadastrados){
                            System.out.println("Digite a nova Hablididade ");
                            String novaHabilidade = sc.nextLine();

                            ninjas[idNinja].habilidadeEspecial = novaHabilidade;
                            System.out.println("atualizado com sucesso!");
                        } else{
                            System.out.println("ninja invalido ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha invalida..");
                    break;
            }
        }


        sc.close();
    }
}
