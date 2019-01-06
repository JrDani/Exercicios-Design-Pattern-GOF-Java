package criacao.factoryAndSingleton.model;

public class BebidaFactory {
	
	private static BebidaFactory instance;
	
	private BebidaFactory(){}
	
	public Bebida criaBebida(String tipo) {
		Bebida bebida = null;
		
		switch(tipo) {
		case "Espresso":
			bebida = new Espresso();
			break;
		case "Frappuccino":
			bebida = new Frappuccino();
			break;
		}
		
		return bebida;
	}
	 
	public static BebidaFactory getInstance() {
		
		if(instance == null) {
			instance = new BebidaFactory();
		}
		
		return instance;
	}
}
