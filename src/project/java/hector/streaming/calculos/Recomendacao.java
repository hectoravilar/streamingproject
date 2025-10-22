package project.java.hector.streaming.calculos;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os Preferidos ");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado ");
        } else {
            System.out.println("Lista ver depois");
        }
    }
}
