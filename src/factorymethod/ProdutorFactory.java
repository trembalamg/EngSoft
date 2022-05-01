package factorymethod;

public class ProdutorFactory {
	public static AbstractFactory getFactory(boolean arrendondado) {

		if (arrendondado) {
			return new FormaArredondadoFactory();
		} else {
			return new FormaFactory();
		}
	}
}