package principal;

import java.sql.*;

public class index {
	
	public static void main(String[] args) throws SQLException {
		listarPessoas();
		Pessoa pessoa = new Pessoa("pedroso","1239123",12.3);
		
//		salvarPessoa(pessoa);
//		inserirPessoas("1","1",1.1);
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
	}
	
	public static void inserirPessoas(String nome,String cpf,Double altura) {
		try {
			String url = "jdbc:mysql://localhost:3306/exemplojdbc";
			String usuario = "root";
			String senha = "positivo";
			String sql = "INSERT INTO pessoas(`nome`,`cpf`,`altura`) VALUES (?,?,?);";
			// 1. Abrir conexão com banco de dados.
			Connection con = DriverManager.getConnection(url,usuario,senha);
			
			// 2. Criar o comando e executar a consulta
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1,"junincaraio");
			comando.setString(2, "02935123");
			comando.setDouble(3, 2.1);
			
			comando.executeUpdate();
		System.out.println("Deu certin pae");
			comando.close();
			con.close();
	
		}catch(Exception falha) {
			System.out.println(falha);
		}
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
