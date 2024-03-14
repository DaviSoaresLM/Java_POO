package superClass05;

public class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(int codigo, String nomeFuncionario) {

    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

}
