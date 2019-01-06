package criacao.FactoryMethod.model;

//Concrete product
public class VideoMobile implements Video {

	@Override
	public String exibe() {		
		return "Exibindo video 360p";
	}

}
