package criacao.abstractFactory.factory;

import criacao.abstractFactory.model.Bermuda;
import criacao.abstractFactory.model.Bola;
import criacao.abstractFactory.model.Chuteira;
import criacao.abstractFactory.model.NikeBermuda;
import criacao.abstractFactory.model.NikeBola;
import criacao.abstractFactory.model.NikeChuteira;

//Concrete Factory
public class NikeFactory extends ArtigoEsportivoFactory {

	@Override
	public Chuteira makeChuteira() {
		return new NikeChuteira();
	}

	@Override
	public Bermuda makeBermuda() {
		return new NikeBermuda();
	}

	@Override
	public Bola makeBola() {
		return new NikeBola();
	}

}
