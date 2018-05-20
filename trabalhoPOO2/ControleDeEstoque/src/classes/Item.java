package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class Item {
    private int num;
    private String descricao, codigoProduto;
    private float valor, quant;

    public void setNum(int num){
	this.num = num;
    }
    public int getNum(){
    	return this.num;
    }
   
    public float getQuant(){    
        return this.quant;
    }

    public void setQuant(int quant){
    	this.quant = quant;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    public float calcularTotal(){
    	//DEFINIR
        return 0;
    }
}
