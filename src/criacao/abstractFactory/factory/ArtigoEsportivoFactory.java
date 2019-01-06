package criacao.abstractFactory.factory;

import criacao.abstractFactory.model.Bermuda;
import criacao.abstractFactory.model.Bola;
import criacao.abstractFactory.model.Chuteira;

//abstract factory
public abstract class ArtigoEsportivoFactory implements ArtigoEsportivoIF{
	
	public static ArtigoEsportivoFactory instancia;
	
	public static ArtigoEsportivoFactory getInstancia(String marca) {
		if(instancia == null) {
			if(marca.equals("nike")){
				instancia = new NikeFactory();
			}else if(marca.equals("adidas")) {
				instancia = new AdidasFactory();
			}
		}
		return instancia;
	}
	
	abstract public Chuteira makeChuteira();
	abstract public Bermuda makeBermuda();	
	abstract public Bola makeBola();

}
