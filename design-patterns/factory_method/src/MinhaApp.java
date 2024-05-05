package factory_method.src;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class MinhaApp {

	public static void main(String[] args) {
		//Empresas de onibus
		Empresa viacaoABCLocal = new EmpresaOnibusUrbano();
				
		Empresa viacaoXYZInter = new EmpresaOnibusInterestadual();
		
		//Emite passagens
		Passagem pUrbano = viacaoABCLocal.emitePassagem("Sao Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));
		
		Passagem pInterestadual = viacaoXYZInter.emitePassagem("Sao Paulo", "Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));
		
		//Exibe detalhes da passagem
		pUrbano.exibeDetalhes();
		
		pInterestadual.exibeDetalhes();
	}

}
