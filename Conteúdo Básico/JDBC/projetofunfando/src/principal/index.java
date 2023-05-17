package principal;

import java.sql.*;

public class index {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		
		// 1. Abrir conexão com banco de dados.
		Connection con = DriverManager.getConnection(url,usuario,senha);
		
		// 2. Criaar o comando e executar a consulta
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
