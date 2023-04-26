package projeto.loja.modulos;

public class Teclado {
	private String nome;
	private double valor;
	
	public Teclado(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
}
