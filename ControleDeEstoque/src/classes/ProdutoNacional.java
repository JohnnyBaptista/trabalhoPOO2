package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class ProdutoNacional extends Produto{

    private float taxaImposto;
 
    public ProdutoNacional() {
        super();
        JOptionPane.showMessageDialog(null, "O preço com impostos fica: "+this.calcularPrecos());
    }
    
    @Override
    public float calcularPrecos() {
        return ((this.getValor()*this.taxaImposto)+this.getValor());
    }

    public void setTaxaImposto(){
    	this.taxaImposto = 0.2f;
    }
    public float getTaxaImposto(){
	return this.taxaImposto;
    }
    
}
