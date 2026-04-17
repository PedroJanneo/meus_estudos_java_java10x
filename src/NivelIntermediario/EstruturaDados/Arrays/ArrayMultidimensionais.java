package NivelIntermediario.EstruturaDados.Arrays;

public class ArrayMultidimensionais {
    public static void main(String[] args) {

        String[][] ninjasEAldeiais = new String[3][3];
        // primeiro [] --> linha
        //segundo [] --> coluna
        ninjasEAldeiais[0][0] = "Konoha";
        ninjasEAldeiais[0][1] = "Naruto";
        ninjasEAldeiais[0][2] = "Itachi";

        ninjasEAldeiais[1][0] = "Areia";
        ninjasEAldeiais[1][1] = "Gaara";
        ninjasEAldeiais[1][2] = "Temari";

        ninjasEAldeiais[2][0] = "Chuva";
        ninjasEAldeiais[2][1] = "Pain";
        ninjasEAldeiais[2][2] = "konan";


//        for (int i = 0; i < ninjasEAldeiais.length; i++) {
//            for (int j = 0; j < ninjasEAldeiais.length; j++) {
//                System.out.println("Aldeiais: " + ninjasEAldeiais[i][j] + " Ninja 1: " + ninjasEAldeiais[0][j] + " ninja 2: " + ninjasEAldeiais[0][j]);
//
//            }
//
//        }
//        for (int i = 0; i < ninjasEAldeiais.length; i++) {
//            System.out.println("Aldeiais: " + ninjasEAldeiais[i][0] + " Ninja 1: " + ninjasEAldeiais[i][i] + " ninja 2: " + ninjasEAldeiais[i][i]);
//        }
        for (int i = 0; i < ninjasEAldeiais.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeiais[i][0]);
            for (int j = 1; j < ninjasEAldeiais[i].length; j++) {
                System.out.println("Ninja: " + ninjasEAldeiais[i][j]);
            }
        }
    }
}
