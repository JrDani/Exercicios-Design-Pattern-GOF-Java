package criacao.builder.model;

//director
//not necessary in this case, for study purposes only
public class MagoDirector {

	private Builder concreteBuilder;

	public MagoDirector(Builder concreteBuilder) {
		this.concreteBuilder = concreteBuilder;		
	}
	
	public MagoDirector setElemento(String tecla) {	
		this.concreteBuilder.setElementos(tecla);		
		return this;
	}
	
	public MagoDirector setSpell(String spell) {
		this.concreteBuilder.setSpell(spell);;
		return this;
	}

}
