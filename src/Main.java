public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");
        System.out.println("project.java.hector.streaming.modelos.Filme: Top Gun: Maverick");


        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // media calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                project.java.hector.streaming.modelos.Filme Top Gun
                project.java.hector.streaming.modelos.Filme de Aventura anos 80
                Ano de lancamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);






    }
}

