package padrao.projeto.builder.gof;

public class Rodar {


    public static void main(String[] args) {

        Cozinha cozinha = new Cozinha();

        SanduicheBuilder fishBuilder = new FishBuilder();
        SanduicheBuilder hamburgerBuilder = new HamburgerBuilder();

        cozinha.fazerSanduiche(fishBuilder);
        fishBuilder.getSanduiche();
        cozinha.fazerSanduiche(hamburgerBuilder);
        hamburgerBuilder.getSanduiche();

    }

}
