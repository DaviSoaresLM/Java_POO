package classe;


public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 10;
        d1.mes = 7;
        d1.ano = 2010;

        Data d2 = new Data();
        d2.dia = 10;
        d2.mes = 12;
        d2.ano = 1990;

        String dataFomatad1 = d1.obterDataFormada();


        System.out.println(d1.obterDataFormada());
        System.out.println(d2.obterDataFormada());
        d1.imprimirDataFormada();
        d2.imprimirDataFormada();
    }
}
