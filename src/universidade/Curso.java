package universidade;

import java.util.List;

public class Curso {
    public List<Estudante> estudantes;
    public String nomeCurso;
    public int codigo;

    public Curso(String nomeCurso, int codigo) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCodigo() {
        return codigo;
    }
}
