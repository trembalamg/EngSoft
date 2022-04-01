package fabricaDeBolo;

public class Abacaxi extends AbstractBolo{      
    
    public Abacaxi() {
        setNome("Abacaxi");
        setPreco(10);
        setTipo("2 ovos");
    }    
    
    @Override
    public void receita() {
        System.out.println("Receitade bolo de Abacaxi");
    }
    
}
