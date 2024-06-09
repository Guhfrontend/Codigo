import Entites.Circle;
import Entites.Enums.Color;
import Entites.Rectangle;
import Entites.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List <Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scan.nextInt();

        for (int i = 1; i<= n; i++){
            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or circle (r/c): ");
            char ch = scan.next().charAt(0);
            System.out.print("Color (Black/blue/red): ");
            Color color = Color.valueOf(scan.next());

            if (ch == 'r'){
                System.out.print("Widht: ");
                Double width = scan.nextDouble();
                System.out.print("Height: ");
                Double height = scan.nextDouble();

                list.add(new Rectangle(color, width
                , height));
            } else {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
