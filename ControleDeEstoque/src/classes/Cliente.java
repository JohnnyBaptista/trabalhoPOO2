package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class Cliente {
    private String cpf;
    private String nome;
    
    public Cliente() {}

    public Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    
    public void setCPF(String cpf){
    	this.cpf = cpf;
    }

    public String getCPF(){
	return this.cpf;
    }

    public String getNome(){
    	return this.nome;
    }

    public void setNome(String nome){
	this.nome = nome;
    }
}
