//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Balanco trimestre;
    int dado;

    trimestre=new Balanco();
    Scanner leitor=new Scanner(System.in);
    IO.println("Digite o valor do mês de janeiro:");
    dado=leitor.nextInt();

    trimestre.setJan(dado);
    trimestre.setFev(23);
    trimestre.setMar(17);
    IO.println(trimestre.calcMedia());
}
