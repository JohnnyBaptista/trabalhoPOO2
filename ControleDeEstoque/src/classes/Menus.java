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
    public Menus() {
        int opt;
        String aux, menu = "MENU";
        menu = menu + "\n1- Cadastrar \n2- Registrar Compra \n3- Relatórios \n4- Salvar Dados \n5- Carregar Dados \n6- Sair";
        aux = JOptionPane.showInputDialog(menu);
        opt = Integer.valueOf(aux);
        
        switch(opt){
            case 1: Cadastrar(); break;
            case 2: new Venda(); break;
            case 3: new Relatorio(); break;
            case 4: new Salvar(); break;
            case 5: new Carregar(); break;
            case 6: break; //sair
            default: JOptionPane.showMessageDialog(null, "\nERRO :("); break;
        }
    }
    
    public void Cadastrar() {
        int opt;
        String aux, menu = "MENU";
        menu = menu + "\n1- Cliente \n2- Produto \n3- Sair";
        aux = JOptionPane.showInputDialog(menu);
        opt = Integer.valueOf(aux);
        if(opt == 1)
            new Cliente();
        else if(opt == 2) {
            menu = "TIPO DE PRODUTO";
            menu = menu + "\n1- Nacional \n2- Importado";
            aux = JOptionPane.showInputDialog(menu);
            opt = Integer.valueOf(aux);
            Produto.tipoProduto(opt);
        }
        else if(opt == 3)
            return;//implementar
        else 
            JOptionPane.showMessageDialog(null, "Entre com uma opção válida.");
    } 
}
