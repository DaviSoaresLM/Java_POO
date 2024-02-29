package treino;

public class thisMetodo {
    public static void main(String[] args) {
        String nome = "Davi";
        int id = 123132;
        float salario = 800.50f;

        Funcionario davi = new Funcionario(nome, id, salario);

        davi.exibir();

    }
}
