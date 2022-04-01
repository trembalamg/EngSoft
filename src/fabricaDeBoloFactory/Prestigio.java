package fabricaDeBoloFactory;


	public class Prestigio extends Bolo{

	    public Prestigio() {
	        setNome("Prestigio");
	        setPreco(40);
	        setTipo("8");
	    }    

	    @Override
	    public void receita() {
	        System.out.println("Receita de bolo de prestígio");
	    }    
	}
