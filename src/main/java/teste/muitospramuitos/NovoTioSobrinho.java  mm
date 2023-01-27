package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia = new Tio("Maria");
		Tio tio = new Tio("Joao");
		
		Sobrinho sobrinho1 = new Sobrinho("Junior");
		Sobrinho sobrinho2 = new Sobrinho("Ana");
		
		tia.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia);
		
		tia.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tia);
		
		tio.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio);
		
		tio.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio);
		
		DAO<Object> dap = new DAO<>();
		
		dap.abrirT()
			.incluir(tia)
			.incluir(tio)
			.incluir(sobrinho1)
			.incluir(sobrinho2)
			.fecharT()
			.fechar();
		
		
	}
	
}
