package principal;
import principal.modelo.Bike;
import principal.modelo.Pessoa;
public class Programa {

	public static void main(String[] args) {
		Bike minhaBike = new Bike();
		
		minhaBike.setModelo("Caloi");
		minhaBike.SetVelocidade(0); // neste momento
		minhaBike.setMarcha(0);
		minhaBike.setpedaladasPorMinutos(0);
		
		
		
		// daqui a 20m
		minhaBike.SetVelocidade(20);
		
		// Imprime os dados da bike
		System.out.println("Modelo: "+minhaBike.getModelo());
		System.out.println("Velocidade: "+minhaBike.getVelocidade());
		System.out.println("Pedaladas Por Minutos: "+minhaBike.getpedaladasPorMinutos());
		System.out.println("Marcha: "+minhaBike.getMarcha());
		System.out.println();

//		EXERCIICO
		
		Pessoa eu = new Pessoa();
		Pessoa voce = new Pessoa();
		
		Pessoa pessoaPedro = new Pessoa();
		Pessoa pessoaAna = new Pessoa();
		Pessoa pessoaCarlos = new Pessoa();
//		Pessoa tu = new Pessoa();
//		Pessoa ele = new Pessoa();
		
		
		eu.setcpf("423432423");
		eu.setnome("Luska");
		eu.setpeso(50.2);
		
		voce.setcpf("124398129");
		voce.setnome("Juaum");
		voce.setpeso(78.2);
		
		pessoaPedro.setnome("Pedro");
		pessoaPedro.setcpf("5253654521");
		pessoaPedro.setidade(18);
		
		pessoaAna.setnome("Ana");
		pessoaAna.setcpf("165846841");
		pessoaAna.setidade(21);
		
		pessoaCarlos.setnome("Carlos");
		pessoaCarlos.setcpf("879513864");
		pessoaCarlos.setidade(23);
		
		
		
		System.out.println("Eu:");
		System.out.println("CPF: "+eu.getCpf());
		System.out.println("Nome: "+eu.getNome());
		System.out.println("Peso: "+eu.getPeso());
		
		System.out.println();
		
		System.out.println("Você");
		System.out.println("CPF: "+voce.getCpf());
		System.out.println("Nome: "+voce.getNome());
		System.out.println("Peso: "+voce.getPeso());
		
		System.out.println();
		
		System.out.println("Você");
		System.out.println("CPF: "+pessoaAna.getCpf());
		System.out.println("Nome: "+pessoaAna.getNome());
		System.out.println("Peso: "+pessoaAna.getIdade());
		
		System.out.println();
		
		System.out.println("Ana:");
		System.out.println("CPF: "+pessoaAna.getCpf());
		System.out.println("Nome: "+pessoaAna.getNome());
		System.out.println("Peso: "+pessoaAna.getIdade());
		
		System.out.println();
		
		System.out.println("Carlos: ");
		System.out.println("CPF: "+pessoaCarlos.getCpf());
		System.out.println("Nome: "+pessoaCarlos.getNome());
		System.out.println("Peso: "+pessoaCarlos.getIdade());
		
		System.out.println();
		
		System.out.println("Pedro: ");
		System.out.println("CPF: "+pessoaPedro.getCpf());
		System.out.println("Nome: "+pessoaPedro.getNome());
		System.out.println("Peso: "+pessoaPedro.getIdade());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
