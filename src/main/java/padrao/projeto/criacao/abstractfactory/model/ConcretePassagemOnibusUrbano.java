package padrao.projeto.criacao.abstractfactory;

public class ConcretePassagemOnibusUrbano extends PassagemOnibusUrbano {

    public ConcretePassagemOnibusUrbano(String origem, String destino, String dataHoraPartida) {
        super( origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Passagem de ônibus urbano: " + this.getOrigem() + " para " + this.getDestino() + " Data/Hora: " + this.getDataHoraPartida());
    }

}

