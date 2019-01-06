package criacao.prototype.factory;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import criacao.prototype.model.Componentes;
import criacao.prototype.model.CssStyle;

public class ComponentsPrototype implements Componentes{
	
	private CssStyle estilo;
	private String conteudo;
	private boolean showStyle;
	
	public ComponentsPrototype(CssStyle estilo, String conteudo) {
		this.estilo = estilo;
		this.conteudo = conteudo;
		this.showStyle=false;
	}

	@Override
	public void setEstilo(CssStyle estilo) {
		this.estilo = estilo;		
	}

	@Override
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String geraHtml() {		
		if(showStyle) {
			String[] partes = this.conteudo.split(">", 2);
			partes[0] = partes[0] + " class='"+estilo.getName()+"'> ";
			this.conteudo = Stream.of(partes).collect(Collectors.joining());
		}
		return this.conteudo;
	}

	@Override
	public Componentes clone() {
		return new ComponentsPrototype(estilo, conteudo);
	}

	@Override
	public void activeStyle(boolean value) {
		this.showStyle=value;
	}

}
