package projeto.model;

import jakarta.persistence.*;
@Entity
public class Livro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String valor;


public Livro() {}

public Livro(String nome, String valor) {
	this.nome = nome;
	this.valor = valor;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getValor() {
	return valor;
}
public void setValor(String valor) {
	this.valor = valor;
}   


}
