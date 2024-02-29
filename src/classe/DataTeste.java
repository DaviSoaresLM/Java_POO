package classe;


public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 10;
        d1.mes = "Agosto";
        d1.ano = 2010;

        Data d2 = new Data();
        d2.dia = 10;
        d2.mes = "Dezembro";
        d2.ano = 1990;

        System.out.printf("Dia %d de %s de %d\n", d1.dia, d1.mes, d1.ano);

        System.out.printf("Dia %d de %s de %d\n", d2.dia, d2.mes, d2.ano);

    }
}
