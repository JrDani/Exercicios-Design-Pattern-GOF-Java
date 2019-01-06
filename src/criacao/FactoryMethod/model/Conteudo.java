package criacao.FactoryMethod.model;

//creator
public interface Conteudo {
	
	//factory method without default
	public Infografico makeInfografico();
	
	//factory method without default
	public Video makeVideo();
}
