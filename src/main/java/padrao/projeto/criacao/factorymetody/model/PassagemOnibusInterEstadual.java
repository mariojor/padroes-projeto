package padrao.projeto.factorymetody.model;

import java.util.Calendar;



public class PassagemOnibusInterEstadual extends Passagem{
    public PassagemOnibusInterEstadual(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println(String.format("Passagem Onibus Interestadual - Origem:%s - Destino:%s - Hora:%s", getOrigem(), getDestino(), df.format(getDataHoraPartida().getTime())));
    }
}
