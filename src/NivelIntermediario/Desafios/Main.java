package NivelIntermediario.Desafios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Uchiha ninja1 = new Uchiha();

        ninja1.nome = "Peu";
        ninja1.idade = 21;
        ninja1.statusMissao = "em andamento";
        ninja1.nivelDificuldade = " Rank A";
        ninja1.missao = " buscar o Hoake";
        ninja1.habilidadeEspecial = " Amaterasu!";

        ninja1.mostrarInformacoes();
        ninja1.mostrarHabilidadeEspecial();
    }
}
