package controle;

public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.canal = 1; // canal padrão
        this.volume = 30; // volume padrão
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        }
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void mostrarStatus() {
        System.out.println("Volume atual: " + volume);
        System.out.println("Canal atual: " + canal);
    }


}
