public class ex3_2 {

    public static void main(String args[]) {
        double jan = 15000;
        double fev = 23000;
        double mar = 17000;
        double soma = (jan + fev + mar);

        System.out.println("a despesa total no trimestre é R$ " + (soma) );
        System.out.printf("a média mensal é R$ %.2f", soma/3);
    }
}

