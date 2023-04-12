package principal;
import principal.modelo.Roda;
import principal.modelo.*;

public class Programa2 {
public static void main(String[] args) {
	
	Quadro quadroDaBike = new Quadro();
	Roda rodaDianteira = new Roda();
	Roda rodaTrasseira = new Roda();
	
	Bike minhaBike = new Bike("neon",2 ,4 ,2 ,quadroDaBike ,rodaDianteira ,rodaTrasseira);
//	minhaBike.setModelo("Kiljoy");
//	minhaBike.setMarcha(3);
//	minhaBike.setPedaladasPorMinutos(23);
	
	
	quadroDaBike.setCor("Vermelha");
	quadroDaBike.setMaterial("Aluminio");
	quadroDaBike.setTamanho("Pequeno");
	
	minhaBike.setQuadroDaBike(quadroDaBike);
	
	
//	rodaDianteiraDaBike.setCor("Vermelho");
//	rodaDianteiraDaBike.setAro(21);
////	rodaDianteiraDaBike.setMaterial("Aço");
//	
//	minhaBike.setrodaDianteira(rodaDianteiraDaBike);
//	
//	
////	rodaTrasseiraDaBike.setCor("Vermelho");
////	rodaTrasseiraDaBike.setAro(21);
////	rodaTrasseiraDaBike.setMaterial("Aço");
//	
//	minhaBike.setrodaTrasseira(rodaTrasseiraDaBike);
	
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
	System.out.println("Aro: "+rodaDianteira.getAro());
	System.out.println("Cor: "+rodaDianteira.getCor());
	System.out.println("Material: "+rodaDianteira.getMaterial());
	
	
	
	
	
	
	
	
	
}
}
