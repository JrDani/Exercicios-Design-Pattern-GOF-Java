package criacao.abstractFactory.factory;

import criacao.abstractFactory.model.Bermuda;
import criacao.abstractFactory.model.Bola;
import criacao.abstractFactory.model.Chuteira;

//FactoryIF (father of abstract factory)
public interface ArtigoEsportivoIF {
	public Chuteira makeChuteira();
	public Bermuda makeBermuda();
	public Bola makeBola();
}
