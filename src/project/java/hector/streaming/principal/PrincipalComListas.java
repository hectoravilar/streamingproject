package project.java.hector.streaming.principal;

import project.java.hector.streaming.modelos.Filme;
import project.java.hector.streaming.modelos.Serie;
import project.java.hector.streaming.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main() {
        var meuFilme = new Filme("Back to the future", 1985);
        meuFilme.avalia(10);
        var outroFilme = new Filme("Spider Man", 2002);
        outroFilme.avalia(10);
        var filmeDoHector = new Filme("The Matrix", 1999);
        filmeDoHector.avalia(8);
        var Friends = new Serie(1994, "Friends");

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoHector);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(Friends);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao" + filme.getClassificacao());

            }

        }
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Hector");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenar");
        System.out.println(buscaPorArtista);
        System.out.println("lista de titulos ordenados ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano ");
        System.out.println(lista);
    }
}
