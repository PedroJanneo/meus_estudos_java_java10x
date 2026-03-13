package NivelIntermediario.Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico gennin = new NinjaBasico("Jota","Chuva de kunai",21);
        NinjaBasico gennin2 = new NinjaBasico("Joao","Chuva de shuriken",24);

        NinjaAvancado kage = new NinjaAvancado("Minato",24,"teletransporte",Habilidade.NINJUTSU);
        NinjaAvancado kage2 = new NinjaAvancado("Naruto",24,"Manto da kurama",Habilidade.SENJUTSU);

        gennin.mostrarInformacoes();
        gennin.executarHabilidade();

        kage.mostrarInformacoes();
        kage.executarHabilidade();

        Ninja[] listaNinja = new Ninja[4]; // só é possivel colcoar ambas (NinjaBasico e Ninjaavancado) na mesma Array, pois ambas são 'filhas' da interface Ninja
        listaNinja[0] = gennin;
        listaNinja[1] = gennin2;
        listaNinja[2] = kage;
        listaNinja[3] = kage2;



        for (int i = 0; i < listaNinja.length; i++) {
            listaNinja[i].mostrarInformacoes();
            listaNinja[i].executarHabilidade();
            System.out.println("-----------------");

        }

        }


    }

