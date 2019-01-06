package criacao.builder;

public class Indroducao {
		/*
		
		GOF BUILDER:			
		O algoritmo para criação de um objeto complexo deve ser independente 
	das partes que compõem o objeto e de como elas são montadas. 
		O processo da construção deve permitir diferentes representações para o 
	objeto e de como elas são montadas.	
	
	
		O Mago invocador:
		Um video game possui como protagonista um mago.
		O mago é controlado pelo jogador via teclado.
		As teclas "q", "w" e "e" controlam os elementos Gelo, Trovão e Fogo respectivamente; Que por
	sua vez são usados para criar feitiços ou Itens mágicos.
		Seja itens ou feitiços lançados, tudo é criado por apenas 2 coisas: elemento e spell.
		Sendo assim é criado um builder que interpreta as teclas criando os elementos, retirando a complexidade
	do cliente. 		 	
	 	O Mago é o Director.
	 	Items e feitiços são os Products.
	 	Builder é a interface com métodos para elementos e spell
	 	Concrete Builder são as diferentes representações e constroem os Products (Ex: feitiços e itens mágicos).	
	 	O sistema deve ser flexível permitindo que novos Concrete builders sejam criados implementando o Builder. 	
	*/
	
	
}
