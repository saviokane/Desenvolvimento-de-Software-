package principal;
import principal.modelo.*;

public class Programa {
	
	
		public static void main(String[] args) {
			
			
			BikeDeTrilha bikeTrilha = new BikeDeTrilha("Mountain", 0, 1, 0,
									  new Quadro ("Rosa","Ferro","Giga"),
									  new Roda ("12","Rosa","Aluminio"),
									  new Roda ("12","Rosa","Aluminio"));
			
			
			System.out.println("========== Informações sobre a bike solicitada ==========");
			System.out.println();
			System.out.println("Modelo: "+bikeTrilha.getModelo());
			System.out.println("Velocidade: "+bikeTrilha.getVelocidade());
			System.out.println("Pedaladas: "+bikeTrilha.getPedaladasPorMinutos());
			System.out.println("Marcha: "+bikeTrilha.getMarcha());
			System.out.println();
			System.out.println("Cor do Quadro: "+bikeTrilha.getQuadroDaBike().getCor());
			System.out.println("Material do Quadro: "+ bikeTrilha.getQuadroDaBike().getMaterial());
			System.out.println("Tamanho do Quadro: "+bikeTrilha.getQuadroDaBike().getTamanho());
			System.out.println();
			System.out.println("Cor da roda Dianteira: "+bikeTrilha.getRodaDianteira().getCor());
			System.out.println("Aro da roda Dianteira: "+bikeTrilha.getRodaDianteira().getAro());
			System.out.println("Material da roda Dianteira: "+bikeTrilha.getRodaDianteira().getMaterial());
			System.out.println();
			System.out.println("Cor da roda Trasseira: "+bikeTrilha.getRodaTrasseira().getCor());
			System.out.println("Aro da roda Trasseira: "+bikeTrilha.getRodaTrasseira().getAro());
			System.out.println("Material da roda Trasseira: "+bikeTrilha.getRodaTrasseira().getMaterial());
			
			
			
				
		}
	
	// =================================================================================================================
	
//	public static void main(String[] args) {
//		
//		
//	
//		Ingrediente molho = new Ingrediente ("Molho","Tomate");
//		Ingrediente queijo = new Ingrediente ("Queijo", "Cheddar");
//		Ingrediente calabresa = new Ingrediente ("Calabresa","Laticinio");
//		Ingrediente oregano = new Ingrediente("Oregano","Planta");
//		Ingrediente trigo = new Ingrediente("Trigo","Farinha");
//		Ingrediente oleo = new Ingrediente("Oléo","1 Xicará");
//		Ingrediente sal = new Ingrediente("Sal","2 Colheres");
//		
//		
//		Pizza pizzaDeQueijo = new Pizza("Queijo Cheddar c/ Calabresa");
//		
//		
//		pizzaDeQueijo.adicionar(queijo);
//		pizzaDeQueijo.adicionar(molho);
//		pizzaDeQueijo.adicionar(calabresa);
//		pizzaDeQueijo.adicionar(oregano);
//		pizzaDeQueijo.adicionar(trigo);
//		pizzaDeQueijo.adicionar(oleo);
//		pizzaDeQueijo.adicionar(sal);
//		
//		   System.out.println("======== Pizza de "+ pizzaDeQueijo.getNome()+" ======== ");
////		 Imprimir ingredientes da pizza
////		 For básico
////		for(int i = 0; i< pizzaDeQueijo.getIngrediente().size(); i++) {
////			Ingrediente ingrediente = pizzaDeQueijo.getIngrediente().get(i); // GET(I) == ingrediente[i] 
////			System.out.println("Nome ingrediente: "+ingrediente.getNome());
////			System.out.println("Descrição ingrediente: "+ingrediente.getDescricao());
////		}
//		
//		// For avançado
//		for(Ingrediente ingrediente : pizzaDeQueijo.getIngredientes()) {
//			System.out.println("Ingrediente: "+ingrediente.getNome());
//			System.out.println("Descrição: "+ingrediente.getDescricao());
//			System.out.println();
//		}
//	}
	
	
	
	
	
	// =================================================================================================================
	
	
	
	
	

//public static void main(String[] args) {
//	
//	Quadro quadroDaBike = new Quadro();
//	Roda rodaDianteira = new Roda();
//	Roda rodaTrasseira = new Roda();
//	
//	Bike minhaBike = new Bike("neon",2 ,4 ,2 ,quadroDaBike ,rodaDianteira ,rodaTrasseira);
////	minhaBike.setModelo("Kiljoy");
////	minhaBike.setMarcha(3);
////	minhaBike.setPedaladasPorMinutos(23);
//	
//	
//	quadroDaBike.setCor("Vermelha");
//	quadroDaBike.setMaterial("Aluminio");
//	quadroDaBike.setTamanho("Pequeno");
//	
//	minhaBike.setQuadroDaBike(quadroDaBike);
//	
//	
////	rodaDianteiraDaBike.setCor("Vermelho");
////	rodaDianteiraDaBike.setAro(21);
//////	rodaDianteiraDaBike.setMaterial("Aço");
////	
////	minhaBike.setrodaDianteira(rodaDianteiraDaBike);
////	
////	
//////	rodaTrasseiraDaBike.setCor("Vermelho");
//////	rodaTrasseiraDaBike.setAro(21);
//////	rodaTrasseiraDaBike.setMaterial("Aço");
////	
////	minhaBike.setrodaTrasseira(rodaTrasseiraDaBike);
//	
//	System.out.println("Especificação da roda:");
//	System.out.println("Modelo: "+minhaBike.getModelo());
//	System.out.println("Pedaladas por min.: "+minhaBike.getPedaladasPorMinutos());
//	System.out.println("Quadro: "+minhaBike.getQuadroDaBike());
//	System.out.println("Roda Dianteira: "+minhaBike.getrodaDianteira());
//	System.out.println("Cor da roda: "+minhaBike.getrodaDianteira().getCor());
//	System.out.println("Aro da roda: "+minhaBike.getrodaDianteira().getAro());
//	System.out.println("Material: "+minhaBike.getrodaDianteira().getMaterial());
//	System.out.println("Marcha: "+minhaBike.getMarcha());
//	
//	System.out.println("Especificações do quadro: ");
//	System.out.println("Material em: "+quadroDaBike.getMaterial());
//	System.out.println("Cor: "+quadroDaBike.getCor());
//	System.out.println("Tamanho: "+quadroDaBike.getTamanho());
//	System.out.println();
//	System.out.println("Especificações da roda:");
//	System.out.println("Aro: "+rodaDianteira.getAro());
//	System.out.println("Cor: "+rodaDianteira.getCor());
//	System.out.println("Material: "+rodaDianteira.getMaterial());
//		
//}
}
