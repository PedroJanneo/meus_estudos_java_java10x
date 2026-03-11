package NivelIntermediario.Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico gennin = new NinjaBasico("Jota","Chuva de kunai",21);
        NinjaBasico gennin2 = new NinjaBasico("Joao","Chuva de shuriken",24);

        NinjaAvancado kage = new NinjaAvancado("Minato",24,"teletransporte","rasengan");
        NinjaAvancado kage2 = new NinjaAvancado("Naruto",24,"Manto da kurama","rasengan gigante");

        gennin.mostrarInformacoes();
        gennin.executarHabilidade();

        kage.mostrarInformacoes();
        kage.executarHabilidade();


        }


    }

