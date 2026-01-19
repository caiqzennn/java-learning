//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double preco = 19.9;
        double desconto;

        if(preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }

        /* COM OPERADOR TERNÁROP */
        double desconto2 = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
        System.out.println(desconto2);
    }
}