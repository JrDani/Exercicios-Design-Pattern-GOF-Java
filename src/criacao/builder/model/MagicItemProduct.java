package criacao.builder.model;

//Product
public class MagicItemProduct {
	private String spell;
	private int atk;
	private int def;
	
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	@Override
	public String toString() {
		return "Magic item created! [name=" + spell + ", atk=" + atk + ", def=" + def + "] \n-100 mana";
	}
	
	
}
