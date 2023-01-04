package padrao.projeto.criacao.abstractfactory;

public abstract class EmpresaOnibus {

    public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, String dataHoraPartida);

    public abstract PassagemOnibusInterEstadual emitePassagemOnibusInterEstadual(String origem, String destino, String dataHoraPartida);
}
