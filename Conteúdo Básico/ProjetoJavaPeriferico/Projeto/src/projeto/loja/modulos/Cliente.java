package projeto.loja.modulos;

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
