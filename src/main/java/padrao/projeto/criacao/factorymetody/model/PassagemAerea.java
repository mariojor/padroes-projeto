package padrao.projeto.factorymetody.model;

import java.util.Calendar;


public class PassagemAerea extends Passagem{
    public PassagemAerea(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println(String.format("Passagem Aerea - Origem:%s - Destino:%s - Hora:%s", getOrigem(), getDestino(), df.format(getDataHoraPartida().getTime())));
    }
}
