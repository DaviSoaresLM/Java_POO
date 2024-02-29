package disciplina;

public class Main {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Orientada a Objeto", 100);
        Disciplina lp1 = new Disciplina("Programming Language 1", 101);

        Professor mauricio = new Professor("Mauricio", 123, poo);
        poo.setProfessor(mauricio);

        System.out.println("Disciplina: ");
        System.out.println(poo.getNomeDisciplina());
        System.out.println("Professor: " + poo.getNomeProfessor());
    }
}
