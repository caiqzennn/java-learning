import java.util.Locale;
import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            //// Entrada de dados pt1
//            Locale.setDefault(Locale.US); // para digitar numeros flutuantes com . ao inves de ,
//            Scanner sc = new Scanner(System.in);
//
//            String x;
//            x = sc.next();
//            System.out.println("vc digitou: " + x);
//
//            int y;
//            y = sc.nextInt();
//            System.out.println("o número digitado foi: " + y);
//
//            double z;
//            z = sc.nextDouble();
//            System.out.printf("o número double digitado foi: %.2f%n", z);
//
//            char a;
//            a = sc.next().charAt(0);
//            System.out.println("vc digitou: " + a);
//
//            System.out.println(x);
//            System.out.println(y);
//            System.out.println(z);
//            sc.close();

            //// Entrada de dados pt2
            Scanner sc = new Scanner(System.in);

            int x;
            String s1, s2, s3;

            x = sc.nextInt();
            sc.nextLine(); // para consumir a quebra de linha do int e não ser atribuida ao s1
            s1 = sc.nextLine(); // next line lê a linha inteira
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("Dados digitados");
            System.out.println(x);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);

            sc.close();
        }
    }
}