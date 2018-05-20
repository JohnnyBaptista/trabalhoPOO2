package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class ProdutoImportado extends Produto{
    
    private final float taxaImposto = 0.20f, taxaImportacao = 0.15f;


    public ProdutoImportado(){};
    
       
    @Override
    public float calcularPrecos() {
       return (this.getValor()*((this.taxaImposto + this.taxaImportacao)+1));
       //Definir
    }

    public float getTaxaImposto(){
    	return this.taxaImposto;
    }
    public float getTaxaImportacao(){
    	return this.taxaImportacao;
    }    
}
