package padrao.projeto.criacao.builder.gof;

public class Cozinha {

    public void fazerSanduiche(SanduicheBuilder sanduicheBuilder){
        sanduicheBuilder.abrePao();
        sanduicheBuilder.insereIngredientes();
        sanduicheBuilder.fechaPao();
    }

}
