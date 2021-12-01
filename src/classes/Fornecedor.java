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
public class Fornecedor implements Imprimir {

    private String razaoSocial;
    private String cnpj;
    private PedidoFornecedor PedidoFornecedor;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PedidoFornecedor getPedidoFornecedor() {
        return PedidoFornecedor;
    }

    public void setPedidoFornecedor(PedidoFornecedor PedidoFornecedor) {
        this.PedidoFornecedor = PedidoFornecedor;
    }

    @Override
    public String imprimirDados() {
        String txt = "";

        for (ItensPedido i : PedidoFornecedor.getItens()) {
            txt += "Livro: " + i.getLivro().getTitulo() + "\nValor Unit.: " + i.getLivro().getValor()
                    + "\nValor Total: " + i.custoTotal() + "\n";
        }

        return txt;
    }

}
