package projeto.loja.modulos;

import java.util.List;

public class Pedido {
	
	private int id;
	private Produto produto;
	
	public Pedido(int id, Produto produto) {
			super();
			this.id = id;
			this.produto = produto;
	
	}
	public Produto getProduto() {
		return produto;
	}
	public int getId() {
		return id;
	}
	
}
