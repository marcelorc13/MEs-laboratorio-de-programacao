
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Aula {

    public Materia materia;
    public Professor professor;
    public String nDaSala;
    public double duracao;

    DateTimeFormatter formatar = DateTimeFormatter.ofPattern("HH:mm");

    public Aula() {
        professor = new Professor("", "", "", 0, 0);
        nDaSala = "";
        duracao = 0;
    }

    public Aula(Materia a_materia, Professor a_professor, String a_nDaSala, double a_duracao) {
        this.materia = a_materia;
        this.professor = a_professor;
        this.nDaSala = a_nDaSala;
        this.duracao = a_duracao;
    }

    public void comecarAula() {
        LocalTime horaAgora = LocalTime.now();
        System.out.println("");
        System.out.println("A aula de " + materia.nome + " comeca agora as " + horaAgora.format(formatar));
    }

    public void exibirAula() {
        LocalTime hora = LocalTime.now();

        System.out.println("");
        System.out.println("-Aula-");
        System.out.println("Materia: " + materia.nome);
        System.out.println("Professor: " + professor.nome + " " + professor.sobrenome);
        System.out.println("Numero da Sala: " + nDaSala);
        System.out.println("Horario: " + hora.format(formatar) + " ate " + hora.plusHours((long) duracao).format(formatar));
    }

}
