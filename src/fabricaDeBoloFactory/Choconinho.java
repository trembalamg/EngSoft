package fabricaDeBoloFactory;

public class Choconinho extends Bolo{

    public Choconinho() {
        setNome("Choconinho");
        setPreco(20);
        setTipo("4 ovos");
    }
    

    @Override
    public void receita() {
        System.out.println("Receita de bolo de Choconinho");
    }

    
}
