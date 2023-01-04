package padrao.projeto.factorymetody.model;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Data
public abstract class Passagem {

    private String origem;
    private String destino;
    private Calendar dataHoraPartida;

    protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    Passagem(String origem, String destino, Calendar dataHoraPartida){
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public abstract void exibeDetalhes();

}
