package principal.modelo;

public class BikeDePasseio extends Bike {
	public BikeDePasseio(String modelo, int velocidade,
			int pedaladas, int marcha, Quadro quadro, Roda rodaDianteira,
			Roda rodaTrasseira) {
		
		super(modelo, velocidade, pedaladas, marcha, quadro,
				rodaDianteira, rodaTrasseira);
	}
}
