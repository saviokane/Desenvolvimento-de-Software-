package principal.modelo;
import principal.modelo.*;
public class Bike {

	
	
	private String modelo;
	private int velocidade;
	private int PedaladasPorMinutos;
	private int marcha;
	private Quadro quadroDaBike;
	private Roda rodaDianteira;
	private Roda rodaTrasseira;

	
	
	// construtores
	public Bike() {
		
	}
	
	public Bike(String modelo, int velocidade,int PedaladasPorMinutos,
				int marcha,Quadro quadroDaBike, Roda rodaDianteira, Roda rodaTrasseira) {
		this.modelo = modelo; 
		this.velocidade = velocidade;
		this.PedaladasPorMinutos = PedaladasPorMinutos;
		this.marcha = marcha;
		this.quadroDaBike = quadroDaBike;
		this.rodaDianteira = rodaDianteira;
		this.rodaTrasseira = rodaTrasseira;
		
	}
	
	// get Roda
	public Roda getrodaDianteira() {
		return rodaDianteira;
	}
	
	public Roda getRodaTrasseira() {
		return rodaTrasseira;
	}
	// get Quadro
	public Quadro getQuadroDaBike() {
		return quadroDaBike;
	}
	
	
	public void setrodaDianteira(Roda rodaDianteira) {
		this.rodaDianteira = rodaDianteira;
	}
	
	public void setrodaTrasseira(Roda rodaTrasseira) {
		this.rodaTrasseira = rodaTrasseira;
	}
	// setQuadro
	public void setQuadroDaBike (Quadro quadroDaBike) {
		this.quadroDaBike = quadroDaBike;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPedaladasPorMinutos() {
		return PedaladasPorMinutos;
	}

	public void setPedaladasPorMinutos(int pedaladasPorMinutos) {
		PedaladasPorMinutos = pedaladasPorMinutos;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public Roda getRodaDianteira() {
		return rodaDianteira;
	}

	public void setRodaDianteira(Roda rodaDianteira) {
		this.rodaDianteira = rodaDianteira;
	}

	public void setRodaTrasseira(Roda rodaTrasseira) {
		this.rodaTrasseira = rodaTrasseira;
	}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Encapsulamento 
//	private String modelo;
//	private int velocidade;
//	private int pedaladasPorMinutos;
//	private int marcha;
	
	
	
	
	// getters
	
//	public String getModelo() {
//		return modelo;
//	}
//	
//	public int getVelocidade() {
//		return velocidade;
//	}
//	
//	public int getpedaladasPorMinutos() {
//		return pedaladasPorMinutos;
//	}
//	
//	public int getMarcha() {
//		return marcha;
//	}
	
	// Setter
	
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//	
//	public void SetVelocidade(int velocidade) {
//		if(velocidade >= 0) {
//		this.velocidade = velocidade;
//		}
//	}
//	
//	public void setpedaladasPorMinutos(int pedaladasPorMinutos) {
//		this.pedaladasPorMinutos = pedaladasPorMinutos;
//	}
//	
//	public void setMarcha(int marcha) {
//		this.marcha = marcha;
//	}
	
}
