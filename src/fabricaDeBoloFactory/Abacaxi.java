package fabricaDeBoloFactory;

public class Abacaxi extends Bolo{    

    public Abacaxi() {
        setNome("Abacaxi");
        setPreco(10);
        setTipo("2 ovos");
    }   

    @Override
    public void receita() {
        System.out.println("Receita de bolo de Abacaxi");
    }
}
