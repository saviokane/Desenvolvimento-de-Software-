package principal;

import java.sql.*;
import java.util.Scanner;

public class index {
	
	public static void main(String[] args) throws SQLException {
		tela();
		
	}
	
	public static void tela() {
		try {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("Informe o que deseja: \n"
				+ "	\n[1] LISTAR\n[2] INSERIR\n[3] ATUALIZAR\n[4] DELETAR");
				opcao = leitor.nextInt();
				
				switch(opcao) {
				case 1:
					listarPessoas();
					break;
				case 2:
					inserirPessoas();
					break;
				case 3: 
					atualizarPessoas();
					break;
				case 4:
					excluirPessoas();
					break;
				}
		}catch(Exception erroscree) {
			System.out.println("Erro ao demonstrar tela");
		}
	}
	
	public static void listarPessoas() {
		try {
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		
		// 1. Abrir conexão com banco de dados.
		Connection con = DriverManager.getConnection(url,usuario,senha);
		
		// 2. Criar o comando e executar a consulta
		Statement comando = con.createStatement();
		ResultSet resultado = comando.executeQuery("select * from pessoas");
		
		// 3. Utilizar os dados
		while(resultado.next()) {
			      int id = resultado.getInt("id");
			      String nome = resultado.getString("nome");
			      String cpf = resultado.getString("cpf");
			      Double altura = resultado.getDouble("altura");
			      System.out.println("\nID: "+id+
			    		  			"\nNome: "+nome+
			    		  			"\nCPF: "+cpf+
			    		  			"\nAltura: "+altura);
		}
		comando.close();
		con.close();
		
		}catch(Exception erro) {
			System.out.println("deu ruim!!!");
		}
		tela();
	}
	
	public static void inserirPessoas() throws SQLException {
		try {
			String url = "jdbc:mysql://localhost:3306/exemplojdbc";
			String usuario = "root";
			String senha = "positivo";
			String sql = "INSERT INTO pessoas(`nome`,`cpf`,`altura`) VALUES (?,?,?);";
			// 1. Abrir conexão com banco de dados.
			Connection con = DriverManager.getConnection(url,usuario,senha);
			
			// 2. Criar o comando e executar a consulta
			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1,"saviocaraio");
			comando.setString(2, "3213123123");
			comando.setDouble(3, 2.1);
			
			comando.executeUpdate();
		System.out.println("Deu certin pae");
			comando.close();
			con.close();
	
		}catch(Exception falha) {
			System.out.println(falha);
		}
		tela();
	}
	
	public static void atualizarPessoas()  {
		try {
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		String sql = "UPDATE pessoas SET `nome` = ?, `cpf` = ?, `altura` = ? WHERE `id` = ?;";
		Connection con = DriverManager.getConnection(url,usuario,senha);
		PreparedStatement comando = con.prepareStatement(sql);
		
		comando.setString(1, "Juliuli");
		comando.setString(2, "0183123");
		comando.setDouble(3, 2.23);
		
		comando.setInt(4, 2);
		
		comando.executeUpdate();
		comando.close();
		con.close();
		}catch(Exception err) {
			System.out.println("Não foi encontrado o ID.");
		}
		tela();
	}
	
	public static void excluirPessoas() {
		
		try {
			
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		String sql = "UPDATE pessoas SET `nome` =`nome` = ?, `cpf` = ?, `altura` = ? WHERE `id` = ?;";
		Connection con = DriverManager.getConnection(url,usuario,senha);
		PreparedStatement comando = con.prepareStatement(sql);
		
		comando.setInt(1, 2);
		comando.executeUpdate();
		
		System.out.println("Pessoa excluida com sucesso!!!");
		comando.close();
		con.close();
		}catch(Exception error) {
			System.out.println("Erro ao excluir meliante.");
		}
		tela();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*INSERT INTO `exemplojdbc`.`pessoas`
(`idpessoas`,
`nome`,
`cpf`,
`peso`)
VALUES
(
'renan',
'21300202',
23.2
);


listar todas as pessoas: 

SELECT `pessoas`.`idpessoas`,
    `pessoas`.`nome`,
    `pessoas`.`cpf`,
    `pessoas`.`peso`
FROM `exemplojdbc`.`pessoas`;
*/
	
}
