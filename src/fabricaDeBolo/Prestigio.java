package fabricaDeBolo;

public class Prestigio extends AbstractBolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(40);
        setTipo("8 ovos");
    }

    
    @Override
    public void receita() {
       System.out.println("Receita de bolo de Prestígio");
    }

    
}
