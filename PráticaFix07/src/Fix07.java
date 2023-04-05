import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Fix07 {
	
public static void main(String[] args) throws FileNotFoundException {
	
	String arquivoOrigem = "C:\\_src\\Desenvolvimento-de-Software-\\Fix07\\src\\kane\\savio\\entidades\\alunos.txt";
	File Arquivo = new File(arquivoOrigem);
	Scanner reader = new Scanner(Arquivo);
	
	// Gravador
	
	String resultado = "C:\\_src\\Desenvolvimento-de-Software-\\PráticaFix07\\src\\resopso.txt";
	Formatter gravador = new Formatter(resultado);
	
	int quant_alunos = 0,aprovados = 0, reprovados = 0, menor_nota = 9, maior_nota = 1;
	reader.nextLine();
	while(reader.hasNext()) {
		
	
	
	quant_alunos++;
	String linha = reader.nextLine();
	String campos[] = linha.split(";");
	Double notas = Double.parseDouble(campos[2]);
	
	campos[2] = campos[2].replace(",", ".");
	}
	gravador.format("\nA quantidade de alunos no total é:"+ quant_alunos);
	gravador.format("\nA quantidade e alunos aprovado é: "+ aprovados +" e reprovados é: "+ reprovados +".");
	gravador.close();
	reader.close();
}
}
