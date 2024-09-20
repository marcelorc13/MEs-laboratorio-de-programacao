
import java.util.Scanner;

public class ExercicioIdade {

    private final int anoAtual = 2012;

    public int calcularIdade(int ano) {
        return anoAtual - ano;
    }

    public static void main(String args[]) {
        ExercicioIdade idade = new ExercicioIdade();

        boolean idadeValida = false;

        Scanner inserirAno = new Scanner(System.in);

        while (!idadeValida) {
            System.out.println("\nInsira o ano do seu nascimento");

            try {
                int anoInserido = Integer.parseInt(inserirAno.nextLine());

                if (idade.calcularIdade(anoInserido) < 0) {
                    System.out.println("Ano Invalido");
                } else {
                    System.out.println("Voce nasceu em " + anoInserido);
                    System.out.println("Voce tem " + idade.calcularIdade(anoInserido) + " anos");

                    idadeValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Insira apenas numeros");
            }
            finally{
                System.out.println("\nServico encerrado!");
            }
        }
    }
}
