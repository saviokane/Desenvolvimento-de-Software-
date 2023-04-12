package principal.modelo;

public class Roda {

	
	private String aro;
	private String cor;
	private String material;
	
	public Roda(String aro, String cor, String material) {
		
		this.aro = aro;
		this.cor = cor;
		this.material = material;
	}
	
	// GETTER
	public String getCor() {
		return cor;
	}
	public String getAro() {
		return aro;
	}
	
		
	public String getMaterial() {
		return material;
	}
	
	// SETTERS
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setAro(String aro) {
		this.aro = aro;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
		
}

