package criacao.abstractFactory.test;

import criacao.abstractFactory.factory.ArtigoEsportivoFactory;
import criacao.abstractFactory.model.Bermuda;
import criacao.abstractFactory.model.Bola;
import criacao.abstractFactory.model.Chuteira;

public class Client {

	public static void main(String[] args) {
		ArtigoEsportivoFactory kit = ArtigoEsportivoFactory.getInstancia("nike");
		
		Bola bola = kit.makeBola();
		Bermuda bermuda = kit.makeBermuda();
		Chuteira chuteira = kit.makeChuteira();		
		
		System.out.println("Kit da nike: " + bola + bermuda + chuteira);
	}

}
