package principal;

public class Pessoa {
	private int id;
	private String nome;
	private String cpf;
	private Double altura;
	
	
	public Pessoa( String nome, String cpf, Double altura) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.altura = altura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
}
