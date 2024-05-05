package sigleton;

public class run {
    public static void main(String[] args) {
        Janela janela = Janela.getInstance();
        Janela janela2 = Janela.getInstance();

        System.out.println(janela);
        System.out.println(janela2);
    }
}

class Janela {
    private static Janela instance = null;
    private Janela(){
    }

    public static Janela getInstance(){
        if(instance == null){
            instance = new Janela();
        }
        return instance;
    }
}