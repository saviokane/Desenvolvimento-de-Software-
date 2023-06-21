package principal.daos;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import jakarta.persistence.*;


public abstract class GenericDAO<T> implements DAO<T> {

	private Class<T> persistedClass;
	private static EntityManager entityManager;

	@SuppressWarnings("unchecked")
	protected GenericDAO() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		persistedClass = (Class<T>) pt.getActualTypeArguments()[0];
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex_mysql");
		entityManager = emf.createEntityManager();
	}

	public T buscarPorId(Integer id) {
		return entityManager.find(persistedClass, id);
	} 

	public List<T> listar() {
		String query = "from " + persistedClass.getName();
		return entityManager.createQuery(query, persistedClass).getResultList();
	}

	public T salvar(T entidade) {
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		entityManager.persist(entidade);
		entityManager.flush();
		t.commit();
		return entidade;
	}

	public void excluir(Integer id) {
		T entidade = buscarPorId(id);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		T mergedEntity = entityManager.merge(entidade);
		entityManager.remove(mergedEntity);
		entityManager.flush();
		tx.commit();
	}

	public T atualizar(T entidade) {
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		entityManager.merge(entidade);
		entityManager.flush();
		t.commit();
		return entidade;
	}
}
