package principal.modelo;

public class Roda {

	
	private double aro;
	private double peso;
	private String cor;
	private String material;
	
	// GETTER
	public String getCor() {
		return cor;
	}
	public double getAro() {
		return aro;
	}
	
	public double getPeso() {
		return peso;
	}
		
	public String getMaterial() {
		return material;
	}
	
	// SETTERS
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAro(double aro) {
		this.aro = aro;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
		
}

