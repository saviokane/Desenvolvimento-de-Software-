package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
//private List<Cliente> clientes = new ArrayList<Cliente>();
private List<Pessoa> pessoas = new ArrayList<Pessoa>();


//	public void adicionar (Cliente clientes) {
//		this.clientes.add(clientes);
//		
//	}
//	
//	public void remover(Cliente clientes) {
//		this.clientes.remove(clientes);
//		
//	}
//	
//	public List<Cliente> getCliente () {
//		return clientes;
//		
//	}
//	
	
	
	public void adicionar (Pessoa pessoas) {
		this.pessoas.add(pessoas);
	}
	
	public void remover(Pessoa pessoas) {
		this.pessoas.remove(pessoas);
		
	}
	
	
	public List<Pessoa> getPessoa () {
		return pessoas;
		
	}
	
	
}
