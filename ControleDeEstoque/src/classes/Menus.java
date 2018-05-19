/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author vedovotto
 */
public class Menus {
    private static int cont = 0;
    private static int maxCli = 1000;
    private Cliente[] vetorClientes;
    private int opt;
    public String aux, menu = "MENU";
    
    public Menus() {
        do {
            this.opt = this.menu();
        } while(this.opt>0 && this.opt<6);
    } 
    
    public int menu() {

        menu = menu + "\n1- Cadastrar \n2- Registrar Compra \n3- Relatórios \n4- Salvar Dados \n5- Carregar Dados \n6- Sair";
        aux = JOptionPane.showInputDialog(menu);
        this.opt = Integer.valueOf(aux);
        
        switch(this.opt){
            case 1: this.Cadastrar(); break;
            case 2: //new Venda(); break;
            case 3: //new Relatorio(); break;
            case 4: //new Salvar(); break;
            case 5: //new Carregar(); break;
            case 6: break; //sair
            default: JOptionPane.showMessageDialog(null, "\nERRO :("); break;
        }
        return this.opt;
    }
    
    public void Cadastrar() {         
        menu = "\n1- Cliente \n2- Produto \n3- Sair";
        aux = JOptionPane.showInputDialog(menu);
        opt = Integer.valueOf(aux);
        if(opt == 1)
            this.cadastrarCliente();
        else if(opt == 2) {
            this.cadastrarProduto();
        }
        else if(opt == 3)
            return;//implementar
        else 
            JOptionPane.showMessageDialog(null, "Entre com uma opção válida.");
    }
    
    public void cadastrarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Nome: "));
        cliente.setCPF(JOptionPane.showInputDialog("CPF: ")); 
        JOptionPane.showMessageDialog(null, "Sucesso :D");           
    }
    
    public void cadastrarProduto() {
        String menu = "TIPO DE PRODUTO";
        menu = menu + "\n1- Nacional \n2- Importado";
        String aux = JOptionPane.showInputDialog(menu);
        opt = Integer.valueOf(aux);
        if(opt == 1) { //nacional
            ProdutoNacional produto = new ProdutoNacional();
        }
        else if(opt == 2) { //importado
            
        }
        //Produto.tipoProduto(opt);
    }
    
    public void setCont() {
        this.cont++;
    }
    
    public int getCont() {
        return this.cont; 
    }

    public static int getMaxCli() {
        return maxCli;
    }

    public static void setMaxCli(int maxCli) {
        Menus.maxCli = maxCli;
    }

    public int getOpt() {
        return opt;
    }

    public void setOpt(int opt) {
        this.opt = opt;
    }
    
    
}
