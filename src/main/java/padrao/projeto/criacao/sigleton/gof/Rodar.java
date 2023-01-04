package padrao.projeto.sigleton.gof;

public class Rodar {

    public static void main(String[] args) {
        Janela j = Janela.getInstance();
        j.pack();
        j.setVisible(true);
    }

}
