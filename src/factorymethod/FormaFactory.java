
package factorymethod;

public class FormaFactory extends AbstractFactory {

	@Override
	public Forma getForma(TipoForma tipo) {
		Forma forma = null;
		switch (tipo) {
		case CIRCULO:
			forma = new Circulo();
			break;
		case RETANGULO:
			forma = new Retangulo();
		}
		return forma;
	}

}