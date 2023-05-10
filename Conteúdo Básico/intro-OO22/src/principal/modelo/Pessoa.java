package principal.modelo;

public class Pessoa {

	private String cpf;
	private String nome;
	private double peso;
	private int idade;
	
	// Getters
	
	public int getIdade() {
		return idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
	
	//Setters
	
	public void setidade(int idade) {
		this.idade = idade;
	}
	
	public void setcpf (String cpf) {
		this.cpf = cpf;
	}
	
	public void setnome (String nome) {
		this.nome = nome;
	}
	
	public void setpeso(double peso) {
		this.peso = peso;
	}
	
}
