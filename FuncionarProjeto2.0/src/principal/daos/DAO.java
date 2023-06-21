package principal.daos;

import java.util.List;
import java.util.Map;

public interface DAO<T> {

	T salvar(T entidade);
	T atualizar(T entidade);
	T buscarPorId(Integer id);
	List<T> listar();
	void excluir(Integer id);


}
