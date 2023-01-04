package padrao.projeto.criacao.abstractfactory.fabrica;

import padrao.projeto.criacao.abstractfactory.model.ConcretePassagemOnibusInterEstadual;
import padrao.projeto.criacao.abstractfactory.model.ConcretePassagemOnibusUrbano;
import padrao.projeto.criacao.abstractfactory.model.PassagemOnibusInterEstadual;
import padrao.projeto.criacao.abstractfactory.model.PassagemOnibusUrbano;

public class ConcreteEmpresaOnibus extends EmpresaOnibus {

    @Override
    public PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, String dataHoraPartida) {
        return new ConcretePassagemOnibusUrbano(origem, destino, dataHoraPartida);
    }

    @Override
    public PassagemOnibusInterEstadual emitePassagemOnibusInterEstadual(String origem, String destino, String dataHoraPartida) {
        return new ConcretePassagemOnibusInterEstadual(origem, destino, dataHoraPartida);
    }
}
