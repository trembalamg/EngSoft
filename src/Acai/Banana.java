package Acai;

public class Banana extends BaseDecorator {

    public Banana(Adicional ac) {
        super(ac);
    }

    @Override
    public double custo() {
        return super.custo() + 13; 
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " Banana ";
    }
   
    
}