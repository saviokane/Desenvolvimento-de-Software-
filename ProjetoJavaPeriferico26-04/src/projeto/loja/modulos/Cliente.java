package projeto.loja.modulos;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {


	private Pedido fazPedido;
	
	public Cliente(String nome, String cpf, String telefone, String email, Pedido fazPedido) {
		super(nome, cpf, telefone, email);
		this.fazPedido = fazPedido;
	}

	

	public Pedido getFazPedido() {
		return fazPedido;
	}
	
	
	
		
}
