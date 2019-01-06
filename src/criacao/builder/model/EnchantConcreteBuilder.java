package criacao.builder.model;

import java.util.ArrayList;
import java.util.List;

//ConcreteBuilder
public class EnchantConcreteBuilder implements Builder{

	private List<ElementoTipo> elementos = new ArrayList<>();
	private String spell;
	
	private int atk=0;
	private int def=0;

	@Override
	public void setElementos(String tecla) {	
		
		switch(tecla){
		case "q":
			this.elementos.add(ElementoTipo.GELO);
			break;
		case "w":
			this.elementos.add(ElementoTipo.TROVAO);
			break;
		case "e":
			this.elementos.add(ElementoTipo.FOGO);
			break;
			
		}
		
	}

	@Override
	public void setSpell(String spell) {
		this.spell = spell;
	}
	
	public int calcStatus() {		
		for (Enum<ElementoTipo> e : elementos) {		
			if( e == ElementoTipo.GELO) {
				def += 3;
				atk += 1;
			}else if( e == ElementoTipo.TROVAO) {
				def += 2;
				atk += 2;
			}else if( e == ElementoTipo.FOGO) {
				def += 1;
				atk += 3;
			}		
		}
		return 0;		
	}
	
	public MagicItemProduct GetResult() {
		MagicItemProduct magicItemProduct = new MagicItemProduct();
		this.calcStatus();
		magicItemProduct.setAtk(atk);
		magicItemProduct.setDef(def);
		magicItemProduct.setSpell(spell);
		
		return magicItemProduct;
	}

}
