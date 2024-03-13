package notaAluno;

public class CalcN {
    public String nome;
    public double nota1, nota2, nota3;

    public double calculoNotas(){
        return nota1 + nota2 + nota3;

    }
    public double notaNecessaria(){
        if (calculoNotas() < 60.0){
            return 60.0 - calculoNotas();
        } else {
            return 0.0;
        }
    }
}
