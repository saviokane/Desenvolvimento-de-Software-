package principal;


import java.util.List;
import jakarta.persistence.*;
import principal.modelos.Pessoa;


public class Programa {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
public static void main(String[] args) {
	// Configuração do JPA
		Persistence.createEntityManagerFactory("exe_mysql");
		emf.createEntityManager();

	// Criação do objeto Pessoa
	Pessoa p = new Pessoa("Luska","2134");
	
	salvar(p);
	
	
	// Buscar pessoa pelo ID
	Pessoa p2 = buscarPorId(2);
	
	System.out.println();
	System.out.println("-----------------------");
	
	System.out.println("Nome: "+p2.getNome()+"CPF"+p2.getCpf());
	
	//Listar pessoas no banco de dados
	List<Pessoa> lista = listar();
	for(Pessoa pessoa : lista) {
		System.out.println("Nome: "+pessoa.getNome()+"CPF: "+ pessoa.getCpf());
	}
	
	// Atualizar dados de uma pessoa
	p2.setNome("Joao Paulo");
	p2.setCpf("9382983");
	
	
	// Encerrando conexão
	em.close();
	emf.close();
	
}

public static Pessoa buscarPorId(Integer id) {
	Pessoa pessoa = em.find(Pessoa.class, id);
	return pessoa;
}

public static List<Pessoa> listar(){
	List<Pessoa> lista = em.createQuery("from Pessoa", Pessoa.class).getResultList();
	return lista;
}

public static Integer salvar(Pessoa pessoa) {
	// Gravação da pessoa no banco de dados
			em.getTransaction().begin();
			em.persist(pessoa);
			em.getTransaction().commit();
		return pessoa.getId();
}


public static Integer atualizar(Pessoa pessoa) {
	// Gravação da pessoa no banco de dados
			em.getTransaction().begin();
			em.merge(pessoa);
			em.getTransaction().commit();
		return pessoa.getId();
}

public static void apagar(Integer id) {
	Pessoa p = em.find(Pessoa.class, id);
	em.getTransaction().begin();
	em.remove(p);
	em.getTransaction().commit();
}

}