package superClass05;

public class Cliente extends Pessoa {
    private String email;

    public Cliente(int codigo, String nomeCliente) {
        super(codigo);
        this.nome = nomeCliente;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getEmail() {
        return email;

    }

    public String getNome() {
        return nome;
    }
}
