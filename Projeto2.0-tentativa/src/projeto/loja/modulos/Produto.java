package projeto.loja.modulos;

import jakarta.persistence.*;

@Entity
public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String nome;
		private double valor;
		
		public Produto() {
			
		}
		
		public Produto(String nome, double valor) {
			this.nome = nome;
			this.valor = valor;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getNome() {
			return nome;
		}
		
		public double getValor() {
			return valor;
		}
	}

	
