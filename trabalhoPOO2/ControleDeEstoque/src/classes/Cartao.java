package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class Cartao extends TipoPagamento{
    private String nome, numero;
    private float dinheiro;
    
    public Cartao(String nome, String numero){
    	this.nome = nome;
	this.numero = numero;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
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
        System.out.println("Tipo de pagamento: " + this.tipoPagamento);
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero do cartao: " + this.numero);
        System.out.println("Quantia: " + this.dinheiro);
    }
    
}
