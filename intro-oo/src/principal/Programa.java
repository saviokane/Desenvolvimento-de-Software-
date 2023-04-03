package principal;
import principal.pesssoa.pessoas;
import principal.modelo.Bicicleta;
public class Programa {

	public static void main(String[] args) {
		Bicicleta minhaBike = new Bicicleta();
		// no momento da criação
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
		
		pessoas Eu = new pessoas();
		
		Eu.setcpf("1532323251");
		Eu.setnome("Juaum");
		Eu.setpeso(50.20);
		
		System.out.println("CPF: "+Eu.getCpf());
		System.out.println("Nome: "+Eu.getNome());
		System.out.println("Peso: "+Eu.getPeso());
		
		
		
		
	}	
}
