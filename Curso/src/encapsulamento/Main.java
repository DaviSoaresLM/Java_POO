package encapsulamento;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.getA());
        objA.setA(222);
        System.out.println(objA.getA());


    }
}
