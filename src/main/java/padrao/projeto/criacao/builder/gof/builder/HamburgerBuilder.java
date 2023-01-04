package padrao.projeto.criacao.builder.gof;

public class HamburgerBuilder extends SanduicheBuilder {
    private final Sanduiche sanduiche = new Hamburguer();

    public void abrePao() {
        System.out.println("Abre pão do hamburguer");
    }
    public void insereIngredientes() {
        System.out.println("insere ambúrguer de carne");
    }
    public void fechaPao() {
        System.out.println("Fecha pão do hamburguer");
    }
    public Sanduiche getSanduiche() {
        System.out.println("Retorna hamburguer");
        return sanduiche;
    }
}
