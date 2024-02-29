package controle;

public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;

    }

    public void aumentarVolume() {
        televisao.aumentarVolume();

    }

    public void diminuirVolume() {
        televisao.diminuirVolume();
    }

    public void aumentarCanal() {
        televisao.aumentarCanal();
    }

    public void diminuirCanal() {
        televisao.diminuirCanal();
    }

    public void trocarCanal(int novoCanal) {
        televisao.trocarCanal(novoCanal);
    }

    public void mostrarStatus() {
        televisao.mostrarStatus();
    }

    public static void main(String[] args) {
        Televisao minhaTV = new Televisao();
        ControleRemoto meuControle = new ControleRemoto(minhaTV);

        meuControle.aumentarVolume();
        meuControle.aumentarCanal();
        meuControle.mostrarStatus();


    }


}
