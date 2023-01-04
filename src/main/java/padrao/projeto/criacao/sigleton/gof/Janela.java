package padrao.projeto.sigleton.gof;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    private static Janela janela;
    private Janela(){
        setPreferredSize(new Dimension(640, 480));
    }

    public static Janela getInstance(){
            if(janela == null){
                janela = new Janela();
            }
            return janela;
    }
}
