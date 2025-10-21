import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while (nota != -1) {
            System.out.println("diga sua avaliacao ou -1 menos 1 para encerrar ");
            nota = leitura.nextDouble();

            if (nota != -1)
                mediaAvaliacao +=  nota;
                totalDeNotas ++;

        }

        System.out.println("media de avaliacao " + mediaAvaliacao/ totalDeNotas);
    }
}
