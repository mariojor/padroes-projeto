package padrao.projeto.criacao.abstractfactory;

public class ConcretePassagemOnibusInterEstadual extends PassagemOnibusInterEstadual {

    public ConcretePassagemOnibusInterEstadual(String origem, String destino, String dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Passagem de ônibus interestadual: " + this.getOrigem() + " para " + this.getDestino() + " Data/Hora: " + this.getDataHoraPartida());
    }
}

