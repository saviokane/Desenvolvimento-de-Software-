package kane.savio.up;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import kane.savio.up.entidade.Produtos;


public class Progama {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String arquivoOrigem = "C:\\_src\\ws\\kane\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\produtos.csv";
		File arquivo = new File(arquivoOrigem); // passar o arquivo depositado no String e depois passa ele para a memoria do Scanner
		Scanner leitor = new Scanner(arquivo);
		
		String arquivoDestino =  "C:\\_src\\ws\\kane\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\relatorio.txt";
		Formatter gravador = new Formatter(arquivoDestino);
		
		Produtos[] vetorDeProdutos = new Produtos[2];
		
		int quantProdutos = 0;
		double totaldosProdutos = 0;
		int Produtos = 0;
		
		
		int index = 0;
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] valores = linha.split(";"); // split serve para quebrar linha e depositar no vetor
			
			Produtos produto = new Produtos();
			produto.codigo = Integer.parseInt(valores[0]);
			produto.nome = valores[1];
			produto.marca = valores[2];
			produto.preco = Double.parseDouble(valores[3]);
			
			vetorDeProdutos[index] = produto;
			index++;
		}
		
		for (int i = 0; i < vetorDeProdutos.length; i++) {
			Produtos produto = vetorDeProdutos[1];
			System.out.println("O produto selecionado é: "+ produto.nome + "\nMarca: "+ produto.marca + "\nValor: " + produto.preco);
			gravador.format("O produto selecionado é: "+ produto.nome + "\nMarca: "+ produto.marca + "\nValor: " + produto.preco);
			
			quantProdutos++;
			totaldosProdutos += Produtos;
			
			// aqui ainda não está retornando o resultado total dos valores e está retornando o mesmo vetores duas vezes  
			
			
		}
		
		
		gravador.close();
		leitor.close();
	}
//	public static void main(String[] args) {
//	
//		Produtos meuProduto = new Produtos();
//		meuProduto.codigo = 1;
//		meuProduto.nome = "Computador";
//		meuProduto.marca = "Dell";
//		meuProduto.preco = 3000.00;
//		
//		System.out.println("O produto selecionado é: "+ meuProduto.nome + "\nMarca: "+ meuProduto.marca + "\nValor: " + meuProduto.preco);
//		System.out.println(" ");
//		
//		Produtos seuProduto = new Produtos();
//		seuProduto.codigo = 2;
//		seuProduto.nome = "iPhone";
//		seuProduto.marca = "Apple";
//		seuProduto.preco = 5000.00;
//		
//		System.out.println("O produto selecionado é: "+ seuProduto.nome + "\nMarca: "+ seuProduto.marca + "\nValor: " + seuProduto.preco);
//		System.out.println(" ");		
//	}	
	
}
