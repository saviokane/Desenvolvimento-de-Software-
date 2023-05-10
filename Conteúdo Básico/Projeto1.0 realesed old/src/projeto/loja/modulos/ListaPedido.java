package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class ListaPedido {
	private List<Pedido> pedido = new ArrayList<Pedido>();
	
	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	public void adicionar(Pedido pedido) {
		this.pedido.add(pedido);
	}
	public void remover(Pedido pedido) {
		this.pedido.remove(pedido);
	}
	public  List<Pedido> getPedido(){
		return pedido;
	}
	
}
