package project.java.hector.streaming.principal;

import project.java.hector.streaming.modelos.Filme;
import project.java.hector.streaming.modelos.Serie;
import project.java.hector.streaming.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    static void main() {
        var meuFilme = new Filme("Back to the future", 1985);
        meuFilme.avalia(10);
        var outroFilme = new Filme("Spider Man", 2002);
        outroFilme.avalia(10);
        var filmeDoHector = new Filme("The Matrix", 1999);
        filmeDoHector.avalia(8);
        var Friends = new Serie(1994, "Friends");

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoHector);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(Friends);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            var filme = (Filme) item;
            System.out.println("Classificacao" + filme.getClassificacao());

        }

    }
}
