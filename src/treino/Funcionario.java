package treino;

public class Funcionario {
    String nome;
    int id;
    float salario;

    public Funcionario(String nome, int id, float salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;

    }

    public void exibir() {
        System.out.printf("O funcionário %s, de número %d, recebe R$ %f", this.nome, this.id, this.salario);

    }

}

