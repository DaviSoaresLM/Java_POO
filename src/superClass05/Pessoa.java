package superClass05;

public class Pessoa {
    private int codigo;
    protected String nome;

    public Pessoa(int codigo) {
        this.codigo = codigo;
        this.nome = "Unknow";
    }

    public int getCodigo() {
        return codigo;
    }
}
