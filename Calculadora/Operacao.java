public class Operacao {

    //atributos
    private int num1;
    private int num2;

    //metodos
    public int somar() {
        return (num1+num2);
    }

    public int dividir() {
        return (num1/num2);
    }

    //construtor
    public Operacao (int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
    }

}
