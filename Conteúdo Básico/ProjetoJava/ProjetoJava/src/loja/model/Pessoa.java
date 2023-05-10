package loja.model;

public class Pessoa {

	private String name;
	private int phone;
	private String email;
	private String cpf;

	public Pessoa (String name, int phone, String email, String cpf){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.cpf = cpf;
	}
	
	public String getName(String name) {
		return name;	
	}
	
	public int getPhone(int phone) {
		return phone;
	}
	
	public String getEmail(String email) {
		return email;
	}
	
	public String getCpf (String cpf) {
		return cpf;
	}
}
