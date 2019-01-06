package criacao.abstractFactory.factory;

import criacao.abstractFactory.model.AdidasBermuda;
import criacao.abstractFactory.model.AdidasBola;
import criacao.abstractFactory.model.AdidasChuteira;
import criacao.abstractFactory.model.Bermuda;
import criacao.abstractFactory.model.Bola;
import criacao.abstractFactory.model.Chuteira;

//Concrete Factory
public class AdidasFactory extends ArtigoEsportivoFactory {

	@Override
	public Chuteira makeChuteira() {
		return new AdidasChuteira();
	}

	@Override
	public Bermuda makeBermuda() {
		return new AdidasBermuda();
	}

	@Override
	public Bola makeBola() {
		return new AdidasBola();
	}

}
