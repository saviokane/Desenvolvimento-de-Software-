package principal;
import principal.modelo.Roda;
import principal.modelo.*;

public class Programa2 {
public static void main(String[] args) {
	

	Bike minhaBike = new Bike();
	minhaBike.setMarcha(3);
	minhaBike.setModelo("Kiljoy");
	minhaBike.setPedaladasPorMinutos(23);
	
	Quadro quadroDaBike = new Quadro();
	quadroDaBike.setCor("Vermelha");
	quadroDaBike.setMaterial("Aluminio");
	quadroDaBike.setTamanho("Pequeno");
	
	minhaBike.setQuadroDaBike(quadroDaBike);
	
	
	Roda rodaDianteiraDaBike = new Roda();
	rodaDianteiraDaBike.setCor("Vermelho");
	rodaDianteiraDaBike.setAro(21);
	rodaDianteiraDaBike.setMaterial("Aço");
	
	minhaBike.setrodaDianteira(rodaDianteiraDaBike);
	
	Roda rodaTrasseiraDaBike = new Roda();
	rodaTrasseiraDaBike.setCor("Vermelho");
	rodaTrasseiraDaBike.setAro(21);
	rodaTrasseiraDaBike.setMaterial("Aço");
	
	minhaBike.setrodaTrasseira(rodaTrasseiraDaBike);
	
	System.out.println("Especificação da roda:");
	System.out.println("Modelo: "+minhaBike.getModelo());
	System.out.println("Pedaladas por min.: "+minhaBike.getPedaladasPorMinutos());
	System.out.println("Quadro: "+minhaBike.getQuadroDaBike());
	System.out.println("Roda Dianteira: "+minhaBike.getrodaDianteira());
	System.out.println("Cor da roda: "+minhaBike.getrodaDianteira().getCor());
	System.out.println("Aro da roda: "+minhaBike.getrodaDianteira().getAro());
	System.out.println("Material: "+minhaBike.getrodaDianteira().getMaterial());
	System.out.println("Marcha: "+minhaBike.getMarcha());
	
	System.out.println("Especificações do quadro: ");
	System.out.println("Material em: "+quadroDaBike.getMaterial());
	System.out.println("Cor: "+quadroDaBike.getCor());
	System.out.println("Tamanho: "+quadroDaBike.getTamanho());
	System.out.println();
	System.out.println("Especificações da roda:");
	System.out.println("Aro: "+rodaDianteiraDaBike.getAro());
	System.out.println("Cor: "+rodaDianteiraDaBike.getCor());
	System.out.println("Material: "+rodaDianteiraDaBike.getMaterial());
	
	
	
	
	
	
	
	
	
}
}
