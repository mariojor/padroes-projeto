package padrao.projeto.criacao.abstractfactory;

import lombok.Data;

@Data
public abstract class PassagemOnibusUrbano {

    protected String origem;
    protected String destino;
    protected String dataHoraPartida;

    public PassagemOnibusUrbano(String origem, String destino, String dataHoraPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public abstract void exibeDetalhes();
}
