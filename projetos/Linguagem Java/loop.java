import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Diga sua avaliação: ");
            nota = scan.nextDouble();
            mediaAvaliacao += nota;

        }
        System.out.println("Média de avaliacções:" + mediaAvaliacao/3);

    }
}
