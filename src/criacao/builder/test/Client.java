package criacao.builder.test;

import criacao.builder.model.EnchantConcreteBuilder;
import criacao.builder.model.FeiticoProduct;
import criacao.builder.model.MagicItemProduct;
import criacao.builder.model.MagoDirector;
import criacao.builder.model.VarinhaConcreteBuilder;

public class Client {
	public static void main(String[] args) {	
		
		VarinhaConcreteBuilder varinhaConcreteBuilder = new VarinhaConcreteBuilder();
		EnchantConcreteBuilder enchantConcreteBuilder = new EnchantConcreteBuilder(); 
		
		MagoDirector magoComVarinha = new MagoDirector(varinhaConcreteBuilder);
		magoComVarinha.setElemento("q")
			.setElemento("q")
			.setElemento("q")
			.setSpell("Ice Wall");
		
		FeiticoProduct iceWall = varinhaConcreteBuilder.GetResult();
		System.out.println(iceWall);
		
		
				
		System.out.println("...");
		
		
		
		// Now the concreteBuilder Enchant			
		
		MagoDirector magoMaterialista = new MagoDirector(enchantConcreteBuilder);
		magoMaterialista.setElemento("w")
			.setElemento("w")
			.setElemento("q")
			.setSpell("Mjolnir");
		
		MagicItemProduct mjolnir = enchantConcreteBuilder.GetResult();
		System.out.println(mjolnir);
	}
}
