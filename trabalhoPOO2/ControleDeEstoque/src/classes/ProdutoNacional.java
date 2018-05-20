package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class ProdutoNacional extends Produto{

    private final float taxaImposto = 0.20f;

    public ProdutoNacional(){};

    
    public float getTaxaImposto(){
	return this.taxaImposto;
    }

    @Override
    public float calcularPrecos() {
        //DEFINIR
        return (this.getValor()*(this.taxaImposto + 1));
    }
    
}
