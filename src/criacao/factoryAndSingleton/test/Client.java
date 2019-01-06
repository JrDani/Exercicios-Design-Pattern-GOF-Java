package criacao.factoryAndSingleton.test;

import criacao.factoryAndSingleton.model.Bebida;
import criacao.factoryAndSingleton.model.BebidaFactory;

public class Client {
	public static void main(String[] args) {
		
		BebidaFactory bebidaFactory = BebidaFactory.getInstance();
		BebidaFactory bebidaFactory2 = BebidaFactory.getInstance();
		
		Bebida cafe = bebidaFactory.criaBebida(new String("Frappuccino"));
		System.out.println(cafe);
		
		System.out.println(bebidaFactory);		
		System.out.println(bebidaFactory2);
	}
}
