package project.java.hector.streaming.modelos;

import project.java.hector.streaming.calculos.Recomendacao;
import project.java.hector.streaming.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    static void main() {
        var meuFilme = new Filme();
        meuFilme.setNome("Back to the future");
        meuFilme.setAnoDeLancamento(1985);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliacoes " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        var lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao da Serie " + lost.getDuracaoEmMinutos());


        var outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2003);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duracao do Filme: " + meuFilme.getDuracaoEmMinutos());

        var calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        var filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoHector = new Filme();
        filmeDoHector.setDuracaoEmMinutos(200);
        filmeDoHector.setNome("The Matrix");
        filmeDoHector.setAnoDeLancamento(1999);
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
