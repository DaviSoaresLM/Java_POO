package herança;

public class Pessoa {
    private int id;
    protected String nome;
     

    public int Pessoa(int id) {
        this.id = id;
        this.nome = "Unknow";
        return id;
    }

    protected int getId(int id) {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
