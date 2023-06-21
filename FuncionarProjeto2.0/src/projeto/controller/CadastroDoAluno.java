package projeto.controller;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import principal.daos.*;
import projeto.model.Aluno;
import java.util.*;

public class CadastroDoAluno {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex_mysql");
	static EntityManager em = emf.createEntityManager();

	private static DAO<Aluno> dao = new AlunoDAO();
	
	public static void create() {
		Scanner leitor = new Scanner(System.in);
		String nome;
		System.out.println("Nome do aluno: ");
		nome = leitor.nextLine();
		Aluno aluno = new Aluno(nome);
		
		dao.salvar(aluno);
		}
	
	
	public static void listar() {
		List<Aluno> alunos = dao.listar();
		
		for(Aluno nome :  alunos) {
			System.out.println("Nome: "+nome.getNome());
		}
	
	}
	public static void deletar() {
List<Aluno> alunos = dao.listar();

Scanner leitor = new Scanner(System.in);
		int i = 0;
		for(Aluno nome :  alunos) {
			i++;
			System.out.println("ID ");
			System.out.println("Nome: "+nome.getNome());
		}
		
		System.out.println("Informe o id");
		int id = leitor.nextInt();
		dao.excluir(id);
		
	}
	
	public static void atualizar() {
		List<Aluno> alunos = dao.listar();
		
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		for(Aluno nome :  alunos) {
			i++;
			System.out.println("ID: "+i);
			System.out.println("Nome: "+nome.getNome());
		}
		
		System.out.println("Informe o id");
		int id = leitor.nextInt();
		leitor.nextLine();
		
		Aluno aluno = dao.buscarPorId(id);
		
		System.out.println("Novo nome: ");
		String nome = leitor.nextLine();
		
		aluno.setNome(nome);
		
		dao.atualizar(aluno);
		System.out.println("Sexo feito!!!");
		
		
		
		
	}
}







































