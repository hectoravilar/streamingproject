public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");
        System.out.println("Filme: Top Gun: Maverick");


        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // media calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de Aventura anos 80
                Ano de lancament
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);



    }
}

