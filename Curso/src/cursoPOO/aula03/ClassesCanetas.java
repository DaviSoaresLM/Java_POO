package cursoPOO.aula03;

public class ClassesCanetas {
    public static void main(String[] args) {
//        Caneta c1 = new Caneta();
//        c1.cor = "Azul";
//
//        c1.tampar();
//        c1.status();
//        c1.rabiscar();
//
//        Caneta c2 = new Caneta();
//        c2.modelo = "Testando";
//        c2.cor = "Preta";
//        c2.destampar();
//        c2.status();
//        c2.rabiscar();


        CanetaAula03 c1 = new CanetaAula03();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 05;
        c1.carga = 80;
        //c1.tampada = false;
        c1.status();
        c1.rabiscar();

    }
}
