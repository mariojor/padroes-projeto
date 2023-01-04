package padrao.projeto.factorymetody;


import padrao.projeto.factorymetody.fabrica.Empresa;
import padrao.projeto.factorymetody.fabrica.PassagemAereaFactory;
import padrao.projeto.factorymetody.fabrica.PassagemOnibusInterEstadualFactory;
import padrao.projeto.factorymetody.fabrica.PassagemOnibusUrbanoFactory;

import java.util.Calendar;

public class Rodar {

    public static void main(String[] args) {
        Empresa passagemInterEstadual = new PassagemOnibusInterEstadualFactory();
        Empresa passagemUrbano = new PassagemOnibusUrbanoFactory();
        Empresa passagemAerea = new PassagemAereaFactory();

        passagemInterEstadual.emitirPassagem("Condado", "Goiana", Calendar.getInstance()).exibeDetalhes();
        passagemUrbano.emitirPassagem("Condado", "Goiana", Calendar.getInstance()).exibeDetalhes();
        passagemAerea.emitirPassagem("Brasil", "Portugal", Calendar.getInstance()).exibeDetalhes();
    }
}
