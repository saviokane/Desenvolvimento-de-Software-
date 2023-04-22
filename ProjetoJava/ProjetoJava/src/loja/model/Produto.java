package loja.model;
public class Produto {

	private String name;
	private int codBarras;
	private double value;
	
	public Produto (String name, int codBarras, double value) {
		this.name = name;
		this.codBarras = codBarras;
		this.value = value;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public int getCodBarras(int codBarras) {
		return codBarras;
	}
	
	public double getValue(double value) {
		return value;
	}
	
}
