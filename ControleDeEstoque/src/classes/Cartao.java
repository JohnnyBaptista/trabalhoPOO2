package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class Cartao extends TipoPagamento{
    private String nome, numero;

    public Cartao(String nome, String numero){
    	this.nome = nome;
	this.numero = numero;
    }

    public void setNome(String nome){
	this.nome = nome;
    }
    public String getNome(){
	return this.nome;
    }
    public void setNumero(String numero){
	this.numero = numero;
    }
    public String getNumero(){
	return this.numero;
    }
    
    @Override
    public void exibirDados() {
        //Definir
    }
    
}
