
import java.text.DecimalFormat;

public class Aluno {

    public String nome;
    public String sobrenome;
    public int idade;
    public double altura;
    public double peso;

    public Aluno() {
        nome = "";
        sobrenome = "";
        idade = 0;
        altura = 0.0;
        peso = 0.0;
    }

    public Aluno(String a_nome, String a_sobrenome, int a_idade, double a_altura, double a_peso) {
        this.nome = a_nome;
        this.sobrenome = a_sobrenome;
        this.idade = a_idade;
        this.altura = a_altura;
        this.peso = a_peso;
    }

    public void exibirAluno() {
        System.out.println("");
        System.out.println("-Aluno-");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    public void medirImc() {

        DecimalFormat formatar = new DecimalFormat("#.##");

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do Peso";
        } else if (imc < 24.9) {
            classificacao = "com o Peso Normal";

        } else if (imc < 29.9) {
            classificacao = "com Sobrepeso";

        } else if (imc < 34.9) {
            classificacao = "com Obesidade Grau I";

        } else if (imc < 39.9) {
            classificacao = "com Obesidade Grau II";

        } else {
            classificacao = "com Obesidade Grau III";
        }

        System.out.println("");
        System.out.println("O IMC do aluno e de aproximadamente: " + formatar.format(imc));
        System.out.println("O aluno esta " + classificacao);
    }
}
