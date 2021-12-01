/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Imprimir;
import pedidos.*;
/**
 *
 * @author aluno
 */
public class Cliente implements Imprimir{
    private String nome;
    private String cpf;
    private PedidoCliente pedidoCliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PedidoCliente getPedidoCliente() {
        return pedidoCliente;
    }

    public void setPedidoCliente(PedidoCliente pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }

    @Override
    public String imprimirDados() {
        String txt ="";
        
        for(ItensPedido i : pedidoCliente.getItens())
            txt += "Livro: " + i.getLivro().getTitulo() +"\nValor Unit.: " +i.getLivro().getValor() +
                    "\nValor Total: " + i.custoTotal() + "\n";
        
        return txt;
    }
    
    
    
}
