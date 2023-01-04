package padrao.projeto.factorymetody.fabrica;

import padrao.projeto.factorymetody.model.Passagem;

import java.util.Calendar;

public abstract class Empresa {
    public abstract Passagem emitirPassagem(String origem, String destino, Calendar dataHora);
}
