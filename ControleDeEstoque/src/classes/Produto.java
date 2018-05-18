package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public abstract class Produto {
    protected String codigo, descricao;
    protected float valor;

    public Produto(){};

    public void setCodigo(String codigo){
    	this.codigo = codigo;
    }
    public String getCodigo(){
	return this.codigo;
    }
    public void setDesc(String desc){
    	this.descricao = desc;
    }
    public String getDesc(){
	return this.descricao;
    }
    public void setValor(float valor){
	this.valor = valor;
    }
    public float getValor(){
	return this.valor;
    }

    public abstract float calcularPrecos();

}
