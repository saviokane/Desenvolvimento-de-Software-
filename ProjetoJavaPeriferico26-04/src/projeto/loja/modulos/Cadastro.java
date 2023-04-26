package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionar (Cliente clientes) {
		this.clientes.add(clientes);
		
	}
	
	public void remover(Cliente clientes) {
		this.clientes.remove(clientes);
		
	}
	
	public List<Cliente> getCliente () {
		return clientes;
		
	}
	
}
