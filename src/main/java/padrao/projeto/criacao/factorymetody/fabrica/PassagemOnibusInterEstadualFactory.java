package padrao.projeto.factorymetody.fabrica;

import padrao.projeto.factorymetody.model.Passagem;
import padrao.projeto.factorymetody.model.PassagemOnibusInterEstadual;

import java.util.Calendar;

public class PassagemOnibusInterEstadualFactory extends Empresa{
    @Override
    public Passagem emitirPassagem(String origem, String destino, Calendar dataHora) {
        return new PassagemOnibusInterEstadual(origem,destino,dataHora);
    }
}
