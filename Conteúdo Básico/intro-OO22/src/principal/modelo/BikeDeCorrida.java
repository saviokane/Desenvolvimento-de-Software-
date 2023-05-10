package principal.modelo;

public class BikeDeCorrida extends Bike {
	public BikeDeCorrida(String modelo, int velocidade,
			int pedaladas, int marcha, Quadro quadro, Roda rodaDianteira,
			Roda rodaTrasseira) {
		
		super(modelo, velocidade, pedaladas, marcha, quadro,
				rodaDianteira, rodaTrasseira);
	}
}
