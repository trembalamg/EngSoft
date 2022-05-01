package factorymethod;

public class FormaArredondadoFactory extends AbstractFactory {

    @Override
    public Forma getForma(TipoForma tipo) {
        Forma forma = null;
        switch (tipo) {
            case CIRCULO:
                forma = new CirculoArredondado();
                break;
            case RETANGULO:
                forma = new RetanguloArredondado();
        
        }
        return forma;
    }

}