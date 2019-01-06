package criacao.builder.model;

import java.util.ArrayList;
import java.util.List;

//ConcreteBuilder
public class VarinhaConcreteBuilder implements Builder {
	private List<ElementoTipo> elementos = new ArrayList<>();
	private String spell;

	//Complex
	@Override
	public void setElementos(String tecla) {		
		switch(tecla){
		case "q":
			this.elementos.add(ElementoTipo.GELO);
			break;
		case "w":
			this.elementos.add(ElementoTipo.TROVAO);
			break;
		case "E":
			this.elementos.add(ElementoTipo.FOGO);
			break;
		}
		
	}
	
	//nothing complex
	@Override
	public void setSpell(String spell) {
		this.spell = spell;
	}
	
	public FeiticoProduct GetResult() {
		 FeiticoProduct feiticoProduct = new FeiticoProduct();
		 feiticoProduct.setElementos(elementos);
		 feiticoProduct.setSpell(spell);
		 return feiticoProduct;
	}

}
