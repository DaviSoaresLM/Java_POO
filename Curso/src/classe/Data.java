package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }
//    public int Data(int dia, int mes, int ano){
//        dia = dia;
//        mes = mes;
//        return dia;
//    }


    String obterDataFormada() {
        return String.format("%d/%d/%d", dia, mes, ano);


    }
    String imprimirDataFormada(){
        System.out.println(obterDataFormada());
        return obterDataFormada();
    }

}
