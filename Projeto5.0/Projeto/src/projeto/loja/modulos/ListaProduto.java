package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class ListaProduto {
	private List<Teclado> teclados = new ArrayList<Teclado>();
	private List<Mouse> mouses = new ArrayList<Mouse>();
	private List<Headset> headsets = new ArrayList<Headset>();
	
	public void adicionar(Teclado teclado) {
		this.teclados.add(teclado);
}
	
	public void remover(Teclado teclado) {
		this.teclados.remove(teclado);
	}
	
	public List<Teclado> getTeclados(){
		return teclados;
	}
	public void setTeclados(List<Teclado> teclados){
	    this.teclados = teclados;
	}

	
	// =============
	
	public void adicionar(Mouse mouse) {
		this.mouses.add(mouse);
}
	
	public void remover(Mouse mouse) {
		this.mouses.remove(mouse);
	}
	
	public List<Mouse> getMouse(){
		return mouses;
	}
	public void setMouse(List<Mouse> mouses){
	    this.mouses = mouses;
	}

	// =================================================
	
	public void adicionar(Headset headsets) {
		this.headsets.add(headsets);
}
	
	public void remover(Headset headsets) {
		this.headsets.remove(headsets);
	}
	
	public List<Headset> getHeadsets(){
		return headsets;
	}
	
	 public void setHeadset(List<Headset> headsets) {
		 this.headsets = headsets;
	 }

	
	
	
	












}


