
public class Main {

    public static void main(String[] args) {
        Aluno alunoMarcelo = new Aluno("Marcelo", "Ramalho", 19, 1.8, 75);
        alunoMarcelo.exibirAluno();
        alunoMarcelo.medirImc();

        Professor professorVital = new Professor("Francisco", "Vital", "Laboratorio de Programacao", 30, 6000);
        professorVital.exibirProfessor();
        professorVital.calcularSalarioAnula();

        Materia materiaLaboratorio = new Materia("Laboratorio de Programacao", professorVital, 2);
        materiaLaboratorio.exibirMateria();

        Aula aulaLaboratorio = new Aula(materiaLaboratorio, professorVital, "9A", 2);
        aulaLaboratorio.comecarAula();
        aulaLaboratorio.exibirAula();

        Escola escolaUnima = new Escola("UNIMA", "Ze Pilintra", 120, "Av. Comendador Gustavo Paiva, 5017");
        escolaUnima.exibirEscola();

    }
}
