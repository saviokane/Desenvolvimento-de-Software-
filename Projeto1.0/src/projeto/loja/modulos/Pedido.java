package projeto.loja.modulos;

public class Pedido {
	
	
	private int id;
	private String produto;
	private String  pessoa;
	private double valor;
	private double valorTotal;
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	
}
