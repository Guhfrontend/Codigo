import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //dados do cliente
        String nome = "Jacqueline Oliveira";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;

        System.out.println(("""
                *************************************
                
                Nome do cliente: %s
                Tipo de conta do cliente: %s
                
                *************************************
                """).formatted(nome, tipoDeConta));
        // menu
        String menu = """
                Operações 
                
                1- Consultar Saldo
                2- Receber Valor 
                3- Transferir Valor
                4- Sair
                
                Digite a Opção desejada:""";
        int opcao = 0;
        while (opcao != 4){
                  System.out.println(menu);
                  opcao = scan.nextInt();
            if (opcao == 1){
                System.out.println(saldo);
            } else if(opcao == 2){
                System.out.println("Quanto quer receber: ");
                double receber =scan.nextDouble();
                if (receber <= 0 ){
                    System.out.println("Valor inválido! ");
                }else{
                    saldo += receber;
                    System.out.println("Seu saldo atual é de "+ saldo);
                }
            } else if (opcao == 3){
                System.out.println("Quanto quer transferir: ");
                double transferir = scan.nextDouble();
                    if (transferir > saldo && saldo < 0){
                        System.out.println("Valor acima do saldo ou inválido!");
                    } else {
                       saldo -= transferir;
                        System.out.println("Seu saldo atual é de " + saldo);
                    }

            }else if (opcao != 4){
                System.out.println("Digito inválido!");
            }


              }

    }
}
