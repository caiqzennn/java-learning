//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // WHILE
        /*
        int xWhile = sc.nextInt();

        int somaWhile = 0;
        while (xWhile != 0) {
            somaWhile += xWhile;
            xWhile  = sc.nextInt();
        }

        // FOR

        System.out.println("Quantos numeros deseja somar?");
        int nFor = sc.nextInt();

        int somaFor = 0;
        for (int i = 0; i < nFor; i++) {
            int xFor = sc.nextInt();
            somaFor += xFor;
        }

        System.out.println(somaFor);
*/
        // DO WHILE
        
        char resp;
        do {

            System.out.print("Digite a temperatura em Celsius");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Em Fahrenheit é igual a %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

        } while (resp != 'n');
    }
}