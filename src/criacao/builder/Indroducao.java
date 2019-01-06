package criacao.builder;

public class Indroducao {
		/*
		
		GOF BUILDER:			
		O algoritmo para cria��o de um objeto complexo deve ser independente 
	das partes que comp�em o objeto e de como elas s�o montadas. 
		O processo da constru��o deve permitir diferentes representa��es para o 
	objeto e de como elas s�o montadas.	
	
	
		O Mago invocador:
		Um video game possui como protagonista um mago.
		O mago � controlado pelo jogador via teclado.
		As teclas "q", "w" e "e" controlam os elementos Gelo, Trov�o e Fogo respectivamente; Que por
	sua vez s�o usados para criar feiti�os ou Itens m�gicos.
		Seja itens ou feiti�os lan�ados, tudo � criado por apenas 2 coisas: elemento e spell.
		Sendo assim � criado um builder que interpreta as teclas criando os elementos, retirando a complexidade
	do cliente. 		 	
	 	O Mago � o Director.
	 	Items e feiti�os s�o os Products.
	 	Builder � a interface com m�todos para elementos e spell
	 	Concrete Builder s�o as diferentes representa��es e constroem os Products (Ex: feiti�os e itens m�gicos).	
	 	O sistema deve ser flex�vel permitindo que novos Concrete builders sejam criados implementando o Builder. 	
	*/
	
	
}
