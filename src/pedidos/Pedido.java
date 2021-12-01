/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import classes.ItensPedido;
import interfaces.Imprimir;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aluno
 */
public abstract class Pedido implements Imprimir{
    
    private String data;
    private List<ItensPedido> itens = new ArrayList();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<ItensPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItensPedido> itens) {
        this.itens = itens;
    }
    
    //custo total de todos os pedidos que estiverem na lista inteira
    public double custoTotal(){
        double valorTotal = 0;
        
        for(ItensPedido i : itens)
            valorTotal += i.custoTotal();
        
        return valorTotal;
    }
    
    @Override
    public String imprimirDados(){
        String txt ="";
        
        for(ItensPedido i : itens){
            txt += "Livro: " + i.getLivro().getTitulo() +"\nValor Unit.: " +i.getLivro().getValor() +
                    "\nQuantidade: " + i.getQtd() + 
                    "\nValor Total: " + i.custoTotal() + "\n\n";
        }
        //valor de todos os itens que o respectivo cidadao pediu
        txt += "Valor da Compra: " + custoTotal() + "\n";
        
        return txt;
    }
    
}
