package project.java.hector.streaming.calculos;

import project.java.hector.streaming.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
