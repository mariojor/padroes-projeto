package padrao.projeto.factorymetody.model;

import java.util.Calendar;


public class PassagemOnibusUrbano extends Passagem{
    public PassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println(String.format("Passagem Onibus Urbano - Origem:%s - Destino:%s - Hora:%s", getOrigem(), getDestino(), df.format(getDataHoraPartida().getTime())));
    }
}
