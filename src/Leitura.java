import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme preferido");
        String filme = leitura.nextLine();
        System.out.println("qual o ano de lancamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("diga sua avaliacao");
        double avaliacao = leitura.nextDouble();


        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
