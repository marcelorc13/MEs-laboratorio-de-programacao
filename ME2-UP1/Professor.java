
public class Professor {

    public String nome;
    public String sobrenome;
    public String materia;
    public int idade;
    public double salario;

    public Professor() {
        nome = "";
        sobrenome = "";
        materia = "";
        idade = 0;
        salario = 0.0;
    }

    public Professor(String p_nome, String p_sobrenome, String p_materia, int p_idade, double p_salario) {
        this.nome = p_nome;
        this.sobrenome = p_sobrenome;
        this.materia = p_materia;
        this.idade = p_idade;
        this.salario = p_salario;
    }

    public void exibirProfessor() {
        System.out.println("");
        System.out.println("-Professor-");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Materia: " + materia);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
    }

    public void calcularSalarioAnula() {
        System.out.println("");
        System.out.println("O salario anual do professor " + nome + "e de R$" + (salario * 12));
    }
}
