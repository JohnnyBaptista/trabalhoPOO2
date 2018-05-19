package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public abstract class Produto {
    protected String codigo, descricao;
    protected float valor;

    public Produto(){
        this.codigo = JOptionPane.showInputDialog("Código do produto: ");
        this.descricao = JOptionPane.showInputDialog("Descrição do produto: ");
        this.valor = Float.valueOf(JOptionPane.showInputDialog("Valor: "));
    }
    
    public abstract float calcularPrecos();
    
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

}
