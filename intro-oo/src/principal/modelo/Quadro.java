package principal.modelo;

public class Quadro {

	private String formato;
	private double peso;
	private String material;
	
	// GETTERS
	
	public String getformato() {
		return formato;
	}
	public double getPeso() {
		return peso;
	}
	
	public String getMaterial() {
		return material;
	}
	
	// SETTERS
	
	public void setFormato(String formato) {
		this.formato = formato;
		}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
