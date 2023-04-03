package principal.modelo;

public class Bicicleta {

	// Encapsulamento 
	private String modelo;
	private int velocidade;
	private int pedaladasPorMinutos;
	private int marcha;
	
	// getters
	
	public String getModelo() {
		return modelo;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getpedaladasPorMinutos() {
		return pedaladasPorMinutos;
	}
	
	public int getMarcha() {
		return marcha;
	}
	
	// Setter
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void SetVelocidade(int velocidade) {
		if(velocidade >= 0) {
		this.velocidade = velocidade;
		}
	}
	
	public void setpedaladasPorMinutos(int pedaladasPorMinutos) {
		this.pedaladasPorMinutos = pedaladasPorMinutos;
	}
	
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
}
