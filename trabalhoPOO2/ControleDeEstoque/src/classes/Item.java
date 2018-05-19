package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class Item {
    int num;
    Produto produto;
    float quant; //Armazenar uma cópia do objeto Produto

    public void setNum(int num){
	this.num = num;
    }
    public int getNum(){
    	return this.num;
    }
    public Produto getProduto(){
    	return this.produto;
    }
    public void setProduto(Produto produto){
    	this.produto = produto;
    }
    public float getQuant(){    
        return this.quant;
    }

    public void setQuant(int quant){
    	this.quant = quant;
    }


    public float calcularTotal(){
    	//DEFINIR
        return 0;
    }
}
