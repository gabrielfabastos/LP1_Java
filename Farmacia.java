import java.util.Scanner;

public class Farmacia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = leitor.nextInt();

        System.out.println("Digite o salário do funcionário:");
        double salario = leitor.nextDouble();

        Funcionario cadastro = new Funcionario(nome, idade, salario);

        System.out.println("Funcionário cadastrado com sucesso!");

        Funcionario c = new Funcionario("José", 50, 2000);
        c.cadastrado("José");
    }
}