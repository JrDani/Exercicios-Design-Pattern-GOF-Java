package criacao.FactoryMethod.model;

//Concrete creator
public class ConteudoDesktop implements Conteudo{

	@Override
	//factory method 
	public Infografico makeInfografico() {
		return new InfograficoDesktop();
	}

	@Override
	//factory method 
	public Video makeVideo() {
		return new VideoFull();
	}

}
