package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class ProdutoNacional extends Produto{

    private float taxaImposto;

    public ProdutoNacional(){};

    public void setTaxaImposto(float taxaImposto){
    	this.taxaImposto = taxaImposto;
    }
    public float getTaxaImposto(){
	return this.taxaImposto;
    }

    @Override
    public float calcularPrecos() {
        //DEFINIR
        return 0;
    }
    
}
