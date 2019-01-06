package criacao.FactoryMethod.model;

//Concrete product
public class VideoFull implements Video {

	@Override
	public String exibe() {
		return "Exibindo video HD 1080p";
	}

}
