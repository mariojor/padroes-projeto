package padrao.projeto.criacao.builder.gof;

public class FishBuilder extends SanduicheBuilder {

    Sanduiche sanduiche = new Fishburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre pão de fishburguer");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere file de peixe");
    }

    @Override
    public void fechaPao() {
        System.out.println("Fecha pão de fishburguer");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Retorna fishburguer");
        return sanduiche;
    }
}
