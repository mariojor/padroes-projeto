package padrao.projeto.prototype;

public class Rodar {

    public static void main(String[] args) {

        Partitura.carregarNotas();

        Partitura.getNota("Do").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Mi").desenha();
        Partitura.getNota("Fa").desenha();
        Partitura.getNota("Sol").desenha();
        Partitura.getNota("La").desenha();
        Partitura.getNota("Si").desenha();
    }

}
