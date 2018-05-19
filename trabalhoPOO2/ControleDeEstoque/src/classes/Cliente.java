package classes;
/**
 *
 * @author João Pedro Baptista
 * @author Vinicius Vedovotto
 */
public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(){};

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

    public void exibeCliente(Cliente c){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
    
    public void exibeTodosClientes(Cliente[] c){
        for(Cliente c1 : c){
            exibeCliente(c1);
        }
    }
    
}
