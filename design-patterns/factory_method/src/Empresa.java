package factory_method.src;

import java.util.Calendar;

//Fabrica
public abstract class Empresa {
	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
	
}
