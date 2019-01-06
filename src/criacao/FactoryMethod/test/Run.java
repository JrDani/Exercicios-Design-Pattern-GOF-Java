package criacao.FactoryMethod.test;

import criacao.FactoryMethod.model.ConteudoDesktop;

public class Run {
	public static void main(String[] args) {
		//Concrete Creator
		ConteudoDesktop conteudoDesktop = new ConteudoDesktop();
		
		//makeInfografico() is a factoryMethod		
		System.out.println(conteudoDesktop.makeInfografico().exibe());
		
		//makeVideo() is a factoryMethod		
		System.out.println(conteudoDesktop.makeVideo().exibe());
	}
}
