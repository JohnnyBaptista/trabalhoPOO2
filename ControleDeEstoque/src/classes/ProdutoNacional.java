package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class ProdutoNacional extends Produto{

    private float taxaImposto = 0.2f;
 
    public ProdutoNacional() {
        super();
        JOptionPane.showMessageDialog(null, "O preço com impostos fica: "+ calcularPrecos());
    }
    
    @Override
    public float calcularPrecos() {
        return ((this.getValor()*this.getTaxaImposto())+this.getValor());
    }

    public float getTaxaImposto(){
	return this.taxaImposto;
    }
    
}
