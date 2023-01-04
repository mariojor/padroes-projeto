package padrao.projeto.abstractfactory;

public class Rodar {
    //Diferenca entre Abstract Factory e Factory Method:
    // abstract factory cria uma familia de objetos bem definidos, e disponibiliza uma interface para criar esses objetos
    // factory method disponibiliza uma factory para cada objeto, e cada factory cria um objeto diferente;
    public static void main(String[] args) {
        final var empresaOnibus = new ConcreteEmpresaOnibus();

        empresaOnibus.emitePassagemOnibusInterEstadual("São Paulo", "Rio de Janeiro", "10/10/2023").exibeDetalhes();
        empresaOnibus.emitePassagemOnibusUrbano("Condado", "Goiana", "21/10/2023").exibeDetalhes();
    }
}
