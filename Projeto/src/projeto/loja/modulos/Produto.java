package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private List<Teclado> teclados = new ArrayList<Teclado>();
	private List<Mouse> mouses = new ArrayList<Mouse>();
	private List<Headset> headsets = new ArrayList<Headset>();
	
	public void adicionar(Teclado teclados) {
		this.teclados.add(teclados);
}
	
	public void remover(Teclado teclados) {
		this.teclados.remove(teclados);
	}
	
	public List<Teclado> getTeclados(){
		return teclados;
	}
	
	// =============
	
	public void adicionar(Mouse mouses) {
		this.mouses.add(mouses);
}
	
	public void remover(Mouse mouses) {
		this.mouses.remove(mouses);
	}
	
	public List<Mouse> getMouse(){
		return mouses;
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


