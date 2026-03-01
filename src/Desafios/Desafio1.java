package Desafios;

public class Desafio1 {

    public static void main(String[] args) {

        // ninja 1
        String ninja1 = "Itachi";
        int idade1 = 21;
        String missao1 = "Derrotar Naruto";
        String status = "Andamento";
        char nivelMissao = 'S';

        if(idade1 >= 15){
            if(nivelMissao == 'C' || nivelMissao == 'D'){
                System.out.println("Missao facil demais...");
            } else  if (nivelMissao == 'S'){
                System.out.println("Dificil, mas fiz");
                status = "Concluido";
         } else {
                System.out.println("Perdi..");
                status = "Fracassado";
            }
        }

        System.out.println("-------------------------------------------");
//        System.out.println("Nome do ninja : " + ninja1 + " idade " + idade1 + " missao " + missao1 + " status " +status + " dificuldade: " + nivelMissao);
        System.out.println("Nome ninja: " + ninja1);
        System.out.println("Idade do ninja: " + idade1);
        System.out.println("Missao: " + missao1 + " dificuldade: " + nivelMissao);
        System.out.println("Status da missao: " + status);
        System.out.println("-------------------------------------------");


        // ninja 2
        String ninja2 = "Hidan";
        int idade2 = 14;
        String missao2 = "Derrotar o Shikamaru";
        String status2 = "Fracassada";
        char nivelMissao2 = 'S';

        if(idade1 >= 15){
            if(nivelMissao2== 'C' || nivelMissao2 == 'D'){
                System.out.println("Missao facil demais...");
            } else  if (nivelMissao2 == 'S'){
                System.out.println("Dificil, mas fiz");
                status2 = "Concluido";
            } else {
                System.out.println("Perdi..");
                status2 = "Fracassado";
            }
        }

        System.out.println("-------------------------------------------");
//        System.out.println("Nome do ninja : " + ninja1 + " idade " + idade1 + " missao " + missao1 + " status " +status + " dificuldade: " + nivelMissao);
        System.out.println("Nome ninja: " + ninja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao: " + missao2 + " dificuldade: " + nivelMissao2);
        System.out.println("Status da missao: " + status2);
        System.out.println("-------------------------------------------");

        //ninja 3
        String ninja3 = "Kakashi";
        int idade3 = 46;
    String missao3 = "Proteger Naruto e Shimkamaru";
        String status3  = "Concluido";
        char nivelMissao3 = 'S';
if(idade3 >= 15){
            if(nivelMissao3 == 'C' || nivelMissao3 == 'D'){
                System.out.println("Missao facil demais...");
            } else  if (nivelMissao3 == 'S'){

                System.out.println("Dificil, mas fiz");
                status3 = "Concluido";
            } else {
                System.out.println("Perdi..");
                status3 = "Fracassado";
            }
        }

        System.out.println("-------------------------------------------");
//        System.out.println("Nome do ninja : " + ninja1 + " idade " + idade1 + " missao " + missao1 + " status " +status + " dificuldade: " + nivelMissao);
        System.out.println("Nome ninja: " + ninja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao: " + missao3 + " dificuldade: " + nivelMissao3);
        System.out.println("Status da missao: " + status3);
        System.out.println("-------------------------------------------");

    }
}
