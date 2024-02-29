package carro;

public class Principal {
    public static void main(String[] args) {
        Carro carroJoao = new Carro();
        carroJoao.quantPneus = 4;
        carroJoao.quantPortas = 4;
        carroJoao.cor = "Vermelho";
        carroJoao.modelo = "Gol";
        carroJoao.acelerar();

        Carro carroMaria = new Carro();
        carroMaria.quantPneus = 4;
        carroMaria.quantPortas = 4;
        carroMaria.cor = "Azul";
        carroMaria.frear();
    }
}
