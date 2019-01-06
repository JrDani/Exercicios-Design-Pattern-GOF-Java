package criacao.prototype.test;

import criacao.prototype.factory.ComponentsPrototype;
import criacao.prototype.model.Componentes;
import criacao.prototype.model.CssStyle;

public class Client {

	public static void main(String[] args) {		
		Componentes prototype = new ComponentsPrototype(new CssStyle(new String("azul")), new String());
		
		Componentes bottom = prototype.clone();
		bottom.setConteudo("<input type='submit' name='send'>\n"); 		
		
		Componentes user = prototype.clone();
		user.setConteudo("<input type='text' name='user'>\n"); 
		
		Componentes form = prototype.clone();
		form.setConteudo("<form>\n"+user.geraHtml()+ bottom.geraHtml() + "</form>");
		form.activeStyle(true);
		
		System.out.println(form.geraHtml());
	}
}
