public class Principal {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Back to the future";
        meuFilme.anoDeLancamento = 1985;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());


    }
}
