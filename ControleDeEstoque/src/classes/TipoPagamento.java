package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public abstract class TipoPagamento {
    protected String tipoPagamento;
    
    public TipoPagamento(){};

    public void setTipo(String tipo){
	this.tipoPagamento = tipo;
    }
    public String getTipo(){
	return this.tipoPagamento;
    }

    public abstract void exibirDados();

}
