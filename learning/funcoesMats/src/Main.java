public class Main {
    public static void main(String[] args){

        double x = 3.0;
        double y = 4.0;
        double z = 5.0;
        double d = -5.0;
        double A, B, C;

        // sqrt = raiz quadrada
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        // pow = elevado/potenciação (x , y) x = numero base, y = potencia
        A = Math.pow(x, y);
        B = Math.pow(2.0, z);
        C = Math.pow(z, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println("2 elevado a " + z + " = " + B);
        System.out.println(z + " elevado a 2 = " + C);

        // abs = valor absoluto, tirar o sinal negativo caso exista
        A = Math.abs(y);
        B = Math.abs(d);
        System.out.println("valor absoluto de " + y + " = " + A);
        System.out.println("valor absoluto de " + z + " = " + B);

        // expressoes matematicas
        double a = 1.0;
        double b = 4.0;
        double c = 2.0;
        double x1, x2;
        double delta;

        delta = Math.pow(b, 2.0) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
