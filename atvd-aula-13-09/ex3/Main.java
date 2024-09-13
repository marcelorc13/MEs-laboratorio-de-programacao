
public class Main {

    public static void main(String args[]) {

        Soma soma1 = new Soma();
        System.out.println("Soma = " + soma1.calcula(2, 2));
        Soma soma2 = new Soma();
        System.out.println("Soma = " + soma2.calcula(15, 7));

        Subtracao subtracao1 = new Subtracao();
        System.out.println("Subtracao = " + subtracao1.calcula(2, 2));
        Subtracao subtracao2 = new Subtracao();
        System.out.println("Subtracao = " + subtracao2.calcula(15, 7));

        Multiplicacao multiplicacao1 = new Multiplicacao();
        System.out.println("Multiplicacao = " + multiplicacao1.calcula(2, 2));
        Multiplicacao multiplicacao2 = new Multiplicacao();
        System.out.println("Multiplicacao = " + multiplicacao2.calcula(15, 7));

        Divisao divisao1 = new Divisao();
        System.out.println("Divisao = " + divisao1.calcula(2, 2));
        Divisao divisao2 = new Divisao();
        System.out.println("Divisao = " + divisao2.calcula(15, 7));
    }
}
