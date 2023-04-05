package principal;
import principal.modelo.Roda;
import principal.modelo.*;

public class Programa2 {
public static void main(String[] args) {
	Roda roda = new Roda();
	Bike bike = new Bike();
	Quadro quadro = new Quadro();
	
	bike.setDono("Savio Kane");
	
	roda.setCor("Vermelho");
	roda.setAro(21);
	roda.setMaterial("Aço");
	
	quadro.setFormato("Full Suspension em Formato Y");
	quadro.setPeso(20);
	quadro.setMaterial("Aluminio");
	
	System.out.println("O dono é: "+ bike.getDono());
	System.out.println();
	System.out.println("Especificações do quadro: ");
	System.out.println("Com quadro no formato: "+quadro.getformato());
	System.out.println("Material em: "+quadro.getMaterial());
	System.out.println("Peso: "+quadro.getPeso());
	System.out.println();
	System.out.println("Especificações da roda:");
	System.out.println("Aro: "+roda.getAro());
	System.out.println("Cor: "+roda.getCor());
	System.out.println("Material: "+roda.getMaterial());
	
	//	Como eu seto um atributo que é do tipo metodo?
	//	bike.setrodaDianteira(23); <--
	
	
	
	
	
	
	
}
}
