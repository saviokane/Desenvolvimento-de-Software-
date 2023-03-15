import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		String opcao = "";
		Scanner leitor = new Scanner(System.in);

		while(opcao != "sair") {
			System.out.println("Escolha uma exercicio:\n1 - Digite (1)\n2 - Digite (2) \n3 - Digite (3) \n4 - Digite (4) \n5 - Digite (5) \n6 - Digite (6)"
					+ "\n7 - Digite (7) \n8 - Digite (8) \n9 - Digite (9) \n10 - Digite (10) \n\n");
		try {
			
			opcao = leitor.nextLine();
			
			switch(opcao) {
			
			case "1":
				ListaExercicios.rodarExe01();
				break;
			case "2":
				ListaExercicios.rodarExe02();
				break;
			case "3":
				ListaExercicios.rodarExe03();
				break;
			case "4":
				ListaExercicios.rodarExe04();
				break;
			case "5":
				ListaExercicios.rodarExe05();
				break;
			case "6":
				ListaExercicios.rodarExe06();
				break;
			case "7":
				ListaExercicios.rodarExe07();
				break;
			case "8":
				ListaExercicios.rodarExe08();
				break;
			case "9":
				ListaExercicios.rodarExe09();
				break;
			case "10":
				ListaExercicios.rodarExe10();
				break;
			default:
				System.out.println("Opção invalida!");
			}
		
		}catch (Exception e) {
			System.out.println("Opção invalida, tente novamente.");
			leitor.nextLine();
		}
//		leitor.close();
		System.out.println("Encerrando o programa.");
		}
	}
}
