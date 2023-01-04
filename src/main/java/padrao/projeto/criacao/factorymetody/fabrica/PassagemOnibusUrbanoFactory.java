package padrao.projeto.factorymetody.fabrica;

import padrao.projeto.factorymetody.model.Passagem;
import padrao.projeto.factorymetody.model.PassagemOnibusUrbano;

import java.util.Calendar;

public class PassagemOnibusUrbanoFactory extends Empresa{
    @Override
    public Passagem emitirPassagem(String origem, String destino, Calendar dataHora) {
        return new PassagemOnibusUrbano(origem,destino,dataHora);
    }
}
