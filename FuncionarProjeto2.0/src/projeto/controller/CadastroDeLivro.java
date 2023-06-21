package projeto.controller;

import java.util.Scanner;

import jakarta.persistence.*;
import principal.daos.*;
import principal.daos.LivroDAO;
import projeto.model.Livro;


import java.util.List;

public class CadastroDeLivro {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex_mysql");
	static EntityManager em = emf.createEntityManager();
	
	private static DAO<Livro> daoLivro = new LivroDAO();
	
	public static void create() {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		String valor;
		
		System.out.println("Nome do Livro: ");
		 nome = leitor.nextLine();
		
		System.out.println("Informe o valor: ");
		 valor = leitor.nextLine();
		
		Livro livro = new Livro(nome,valor);
		
		daoLivro.salvar(livro);
		leitor.close();
	}
	
	public static void listar() {
		List<Livro> livros = daoLivro.listar();
		
		for(Livro livro : livros) {
			System.out.println("Nome: "+livro.getNome());
			System.out.println("Valor: "+livro.getValor());
		}
	}
}


