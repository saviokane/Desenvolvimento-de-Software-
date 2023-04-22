package projeto.loja.tela;
import projeto.loja.modulos.*;

public class Tela {
public static void main(String[] args) {
	
	Mouse MouseRazer = new Mouse("Mouse Razer",123);
	Mouse MouseHyperx = new Mouse("Mouse Hyperx",123);
	
	Teclado TecladoRazer = new Mouse("Teclado Razer",123);
	Teclado TecladoHyperx = new Mouse("Teclado Hyperx",123);
	
	Headset HeadsetRazer = new Headset("Headset cobra",232);
	
	Produto produto = new Produto();
	
	produto.adicionar(MouseHyperx);
	produto.adicionar(TecladoHyperx);
	produto.adicionar(HeadsetRazer);
	
	System.out.println("\n===Lista de Teclado===\n");
	
	for(Teclado teclado : produto.getTeclados()) {
		System.out.println("Nome: "+TecladoHyperx.getNome());
		System.out.println("Valor: "+TecladoHyperx.getValor());
	}
	
	System.out.println("\n===Lista de mouses===\n");
	for(Mouse mouses : produto.getMouse()){
	
		System.out.println("Nome: "+MouseHyperx.getNome());
		System.out.println("Valor: "+MouseHyperx.getValor());
		
	}
	
	System.out.println("\n===Lista de Headsets===\n");
	
	for(Headset headsets : produto.getHeadsets()){
		
		System.out.println("Nome: "+HeadsetRazer.getNome());
		System.out.println("Valor: "+HeadsetRazer.getValor());
		
	}
		
		
	
}
}
