package projeto.loja.controller;
import projeto.loja.modulos.*;
import projeto.loja.util.Mensagem;

import java.util.List;
import java.util.Scanner;

import daos.DAO;
import daos.PessoaDAO;
import projeto.loja.modulos.Pessoa;
import projeto.loja.tela.TelaDeClientes;
import projeto.loja.tela.TelaDePedidos;

public class ControlCliente {

	static String pessoa;
	static int i;

	private DAO<Pessoa> dao = new PessoaDAO();

	public List<Pessoa> getClientes() {
		return dao.listar();
	}
	
	public Pessoa buscar(Integer id) {
		return dao.buscarPorId(id);
	}

		public void adicionar(Pessoa pessoa) {
			dao.salvar(pessoa);
		}


	public void atualizar(Pessoa pessoa) {
		dao.atualizar(pessoa);
	}

	public void excluir(Integer id) {
		dao.excluir(id);
	}

	
}
