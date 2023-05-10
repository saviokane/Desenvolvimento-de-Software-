package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente {
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
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
