package fabricaDeBoloFactory;

public class FlorestaNegra extends Bolo{

    public FlorestaNegra() {
        setNome("Floresta negra");
        setPreco(30);
        setTipo("6 ovos");
    }    

    @Override
    public void receita() {
        System.out.println("Receita de bolo de Floresta Negra");
    }

   
}
