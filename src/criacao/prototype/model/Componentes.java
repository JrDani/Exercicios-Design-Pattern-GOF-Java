package criacao.prototype.model;

//prototype
public interface Componentes {
	public void setEstilo(CssStyle estilo);
	public void setConteudo(String conteudo);
	public String geraHtml();
	public void activeStyle(boolean value);
	
	public Componentes clone();
}
