import java.util.Scanner;

public class Calculadora {

    public void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os números");
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        Operacao o = new Operacao(a,b);
        System.out.println(o.dividir());
    }
}
