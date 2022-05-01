package Pinos;

public class TestaPinos {

	public static void main(String[] args) {
		BuracoRedondo buraco = new BuracoRedondo(50);
        PinoQuadrado pinoQ = new PinoQuadrado(10);
        System.out.println("A largura do pino quadrado �: " + pinoQ.getLargura());
        System.out.println("O seu quadrado equivale a: " + pinoQ.getQuadrado());

        PinoQuadradoAdapter pinoR = new PinoQuadradoAdapter(pinoQ);
        System.out.println("\nO raio do pino redondo �: " + pinoR.getRaio());

        System.out.println("\nO pino redondo encaixa no buraco? " + buraco.Encaixa(pinoR));

	}

}
