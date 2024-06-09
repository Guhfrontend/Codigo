import Entites.ImportedProduct;
import Entites.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List <Product> list = new ArrayList<>();

        System.out.print("Enter the number products: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){

            System.out.println("Product #"+ i +" data:");

            System.out.print("Comoon, used or imported (c/u/i): ");
            char ch = scan.next().charAt(0);

            System.out.print("Name: ");
            scan.next();
            String name = scan.nextLine();

            System.out.print("Price: ");
            Double price = scan.nextDouble();

                if (ch == 'i'){
                    System.out.print("Custom fee: ");
                    Double customsFee = scan.nextDouble();
                    list.add(new ImportedProduct(name, price, customsFee));
                } if (ch == 'u'){
                System.out.print("Manufacture date: ");
            } else {
                    list.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product product : list ){
            System.out.println(product.priceTag());
        }
    }
}
