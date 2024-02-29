package controle;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int dataNascimento;
    private float altura;

    public Pessoa(String nome, int dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;

    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura + "metros");
    }

    public int calcularIdade() {
        int idade = Calendar.getInstance().get(Calendar.YEAR) - dataNascimento;
        return idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Lucas", 2001, 1.75f);
        pessoa1.imprimirDados();
        System.out.println("Idade: " + pessoa1.calcularIdade() + " anos");
    }

}