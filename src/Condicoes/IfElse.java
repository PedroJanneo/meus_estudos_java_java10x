package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        short age = 26;
        boolean kingOfPirate = false;
        short levelisHaki = 10001;

        if( levelisHaki >= 1000 && age <=20) {
            System.out.println("Pronto para ser imediato ");
        } else if( age > 20 && levelisHaki <100) {
            System.out.println("Treine seu haki e volte");
        } else if (levelisHaki > 10000 && age >= 25){
            kingOfPirate = true;
                    if (kingOfPirate){
                        System.out.println("Haki do rei liberado. Sintam a pressão do próximo rei dos piratas");
                    }
        } else {
            System.out.println("sai daqui pirralho");
        }

    }
}
