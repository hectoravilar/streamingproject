package project.java.hector.streaming.principal;

import project.java.hector.streaming.calculos.Recomendacao;
import project.java.hector.streaming.calculos.CalculadoraDeTempo;
import project.java.hector.streaming.modelos.Episodio;
import project.java.hector.streaming.modelos.Filme;
import project.java.hector.streaming.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main() {
        var meuFilme = new Filme("Back to the future", 1985);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliacoes " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        var Friends = new Serie(1994, "Friends");
        Friends.exibeFichaTecnica();
        Friends.setTemporadas(10);
        Friends.setEpisodiosPorTemporada(10);
        Friends.setMinutosPorEpisodio(23);
        System.out.println("Duracao da Serie " + Friends.getDuracaoEmMinutos());


        var outroFilme = new Filme("Spider Man", 2002);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duracao do Filme: " + meuFilme.getDuracaoEmMinutos());

        var calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(Friends);
        System.out.println(calculadora.getTempoTotal());


        var filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Friends);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoHector = new Filme("The Matrix", 1999);
        filmeDoHector.setDuracaoEmMinutos(200);
        filmeDoHector.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoHector);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}
