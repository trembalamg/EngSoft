package Pinos;

public class BuracoRedondo {
	private final double raio;

	public BuracoRedondo(double raio) {
		this.raio = raio;
	}

	public boolean Encaixa(PinoQuadradoAdapter pinoR) {
		return this.raio > pinoR.getRaio();
	}
}
