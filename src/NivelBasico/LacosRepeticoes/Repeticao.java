package NivelBasico.LacosRepeticoes;

public class Repeticao {
    public static void main(String[] args) {

        int numeroClones = 0;
        int numeroMaximoClones = 47;

            // while
        while (numeroClones <= numeroMaximoClones){
            System.out.println("Quantidade de clones: " + numeroClones);
            numeroClones++;
         }

            // for
        for(int i = 0; i <= numeroMaximoClones; i++){
            System.out.println("Fazendo o for agora " + i);
        }



    }
}
