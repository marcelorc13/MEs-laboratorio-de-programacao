
public class Materia {

    public String nome;
    public Professor professor;
    public int periodo;

    public Materia(String m_nome, Professor m_professor, int m_periodo) {
        this.nome = m_nome;
        this.professor = m_professor;
        this.periodo = m_periodo;
    }

    public void exibirMateria() {
        System.out.println("");
        System.out.println("-Materia-");
        System.out.println("Nome: " + nome);
        System.out.println("Professor: " + professor.nome);
        System.out.println("Periodo: " + periodo);
    }
}
