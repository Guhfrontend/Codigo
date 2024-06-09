public class java2 {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoAno = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022){

            System.out.println("Lançamento que os clientes estão curtindo!");

        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoAno == true && tipoPlano.equals("Plus")){
            System.out.println("Filme liberado!");
        } else{
            System.out.println("Deve pagar a locação");
        }

    }
}
