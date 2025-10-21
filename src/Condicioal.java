public class Condicioal {
   public static void main(String[] args) {
       int anoDeLancamento = 2022;
       boolean incluidoNoPlano = true;
       double notaDoFilme = 8.1;
       String tipoPlano = "plus";


       if (anoDeLancamento >= 2022){
           System.out.println("Lancamento que os clientes estao curtindo");
       } else {
           System.out.println("project.java.hector.streaming.modelos.Filme retro");
       }

       if (incluidoNoPlano == true && tipoPlano.equals("plus")){
           System.out.println("project.java.hector.streaming.modelos.Filme liberado");
       } else {
           System.out.println("Deve pagar a locacao");
       }
    }
}
