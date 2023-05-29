package projeto.loja.modulos;

public class Pedido {
	

	private Teclado teclado;
	private Mouse mouse;
	private Headset headset;
	private Pessoa  pessoa;


	public Pessoa getPessoa() {
		return pessoa;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public Headset getHeadset() {
		return headset;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setHeadset(Headset headset) {
		this.headset = headset;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
}
