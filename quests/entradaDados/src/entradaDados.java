import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro numero");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero");
        b = sc.nextInt();

        int c = a + b;
        System.out.println("Soma = " + c);
        sc.close();
    }
}
