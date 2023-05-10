package principal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	private String nome;
	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	public Pizza() {
	}
	
	public Pizza(String nome) {
		this.nome = nome;
	}
	
	public void adicionar(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}
	
	public void remover(Ingrediente ingrediente) {
		this.ingredientes.remove(ingrediente);
	}
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
