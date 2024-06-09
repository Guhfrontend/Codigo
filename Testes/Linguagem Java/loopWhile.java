import java.util.Scanner;

public class loopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação ou -1 para encerrar: ");
            nota = scan.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            } else {
                System.out.println("Obrigado por fazer");
            }

        }
        System.out.println("Média de avaliacções:" + mediaAvaliacao/ totalDeNotas);

    }
}
