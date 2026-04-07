package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

// usamos <T> para receber qualquer tipo, genérico
public class Bolsa<T> {

    private List<T> bolsaItens;


    public Bolsa() {
        this.bolsaItens = new ArrayList<>(); // inicializando a ArrayList
    }

    public void adicionarItem(T equipamento){
        bolsaItens.add(equipamento); // adicionando item na ArrayList
    }

    public List<T> getBolsaItens() {
        return bolsaItens;
    }

    public void setBolsaItens(List<T> bolsaItens) {
        this.bolsaItens = bolsaItens;
    }

    @Override
    public String toString() {
        return "Bolsa: " + bolsaItens;
    }
}
