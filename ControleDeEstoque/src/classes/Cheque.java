package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class Cheque extends TipoPagamento{
    private String nomeEmissor, numeroCheque;

    public Cheque(String nome, String numero){
    	this.nomeEmissor = nome;
	this.numeroCheque = numero;
    }

    public void setNome(String nome){
	this.nomeEmissor = nome;
    }
    public String getNome(){
    	return this.nomeEmissor;
    }
    public void setNumero(String numero){
	this.numeroCheque = numero;
    } 
    public String getNumero(){
	return this.numeroCheque;
    }

    @Override
    public void exibirDados() {
        //Definir
    }
}
