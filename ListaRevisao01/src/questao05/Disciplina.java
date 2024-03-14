package questao05;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public Professor professor;

    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeProfessor() {
        return this.professor.nomeProfessor;
    }
}
