package criacao.builder.model;

import java.util.List;

//Product
public class FeiticoProduct {
	
	private String spell;
	private List<ElementoTipo> elementos;
	
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
	public List<ElementoTipo> getElementos() {
		return elementos;
	}
	public void setElementos(List<ElementoTipo> elementos) {
		this.elementos = elementos;
	}
	
	@Override
	public String toString() {
		return "Casting spell: [spell=" + spell + ", elementos=" + elementos + "] \n-50 mana";
	}
	
	
	
	
}
