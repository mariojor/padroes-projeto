package padrao.projeto.factorymetody.fabrica;

import padrao.projeto.factorymetody.model.Passagem;
import padrao.projeto.factorymetody.model.PassagemAerea;

import java.util.Calendar;

public class PassagemAereaFactory extends Empresa{
    @Override
    public Passagem emitirPassagem(String origem, String destino, Calendar dataHora) {
        return new PassagemAerea(origem,destino,dataHora);
    }
}
