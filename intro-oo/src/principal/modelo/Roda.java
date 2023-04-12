package principal.modelo;

public class Roda {

	
	private double aro;
	private String cor;
	private String material;
	
	public Roda(double aro, String cor, String material) {
		
		this.aro = aro;
		this.cor = cor;
		this.material = material;
	}
	
	// GETTER
	public String getCor() {
		return cor;
	}
	public double getAro() {
		return aro;
	}
	
		
	public String getMaterial() {
		return material;
	}
	
	// SETTERS
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setAro(double aro) {
		this.aro = aro;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
		
}

