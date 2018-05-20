package classes;

import java.util.ArrayList;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnnyBaptista
 */
public class Venda {
    private String numero;
    private TipoPagamento tipoPgto;
    private Cliente cliente;
    Calendar data;
    ArrayList<Item> itens = new ArrayList();
    
    public void addItem(Item i){
        itens.add(i);
    }
    
    public float calcularTotal(){
        float value = 0f;
        for(Item item : itens){
            value += item.getValor();
        }
        return value;
    }
    
}
