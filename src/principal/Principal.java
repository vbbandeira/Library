/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.*;
import pedidos.*;
import interfaces.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        //Imprimindo informacoes sobre o Fornecedor
        JOptionPane.showMessageDialog(null, abaFornecedor());

        //Imprimindo informacoes sobre o Cliente
        JOptionPane.showMessageDialog(null, abaCliente());
    }

    public static String abaFornecedor() {

        //ABA DO FORNECEDOR
        //Primeiro objeto de itens
        ItensPedido itens = new ItensPedido();

        //Criando Livro 1 para ser colocado em uma lista de pedidos
        Livro alquimista = new Livro();

        alquimista.setTitulo("O Alquimista");
        alquimista.setEdicao(12);
        alquimista.setEditora("Inova Editora");
        alquimista.setAutor("Paulo Coelho");
        alquimista.setValor(45.00);

        itens.setLivro(alquimista);
        itens.setQtd(30);

        //Segundo objeto de itens
        ItensPedido itens2 = new ItensPedido();

        //Criando Livro 2 para ser colocado em uma lista de pedidos
        Livro american = new Livro();

        american.setTitulo("American Gods");
        american.setEdicao(25);
        american.setEditora("GBA Editor's");
        american.setAutor("Neil Patrick");
        american.setValor(59.00);

        itens2.setLivro(american);
        itens2.setQtd(50);

        List<ItensPedido> listaDeItens = new ArrayList();
        listaDeItens.add(itens);
        listaDeItens.add(itens2);

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCnpj("817471");
        fornecedor.setRazaoSocial("Fornecimento LTDA");

        PedidoFornecedor pedidoFornecedor = new PedidoFornecedor();

        pedidoFornecedor.setData("02/09/2017");
        pedidoFornecedor.setItens(listaDeItens);
        pedidoFornecedor.setFornecedor(fornecedor);
        pedidoFornecedor.setDataRecebimento("13/09/2017");

        String txt = "Pedido Fornecedor: \n";

        txt += pedidoFornecedor.imprimirDados();

        return txt;
    }

    public static String abaCliente() {

        //ABA DO CLIENTE
        //Primeiro objeto de itens
        ItensPedido itens = new ItensPedido();

        //Criando Livro 1 para ser colocado em uma lista de pedidos
        Livro got = new Livro();

        got.setTitulo("Game Of Thrones");
        got.setEdicao(12);
        got.setEditora("Inova Editora");
        got.setAutor("RR Martin");
        got.setValor(35.00);

        itens.setLivro(got);
        itens.setQtd(5);

        //Segundo objeto de itens
        ItensPedido itens2 = new ItensPedido();

        //Criando Livro 2 para ser colocado em uma lista de pedidos
        Livro percy = new Livro();

        percy.setTitulo("Percy Jackson");
        percy.setEdicao(34);
        percy.setEditora("GBA Editor's");
        percy.setAutor("Rick Riordan");
        percy.setValor(25.00);

        itens2.setLivro(percy);
        itens2.setQtd(3);

        List<ItensPedido> listaDeItens = new ArrayList();
        listaDeItens.add(itens);
        listaDeItens.add(itens2);

        Cliente cliente = new Cliente();

        cliente.setNome("Joao Carlos");
        cliente.setCpf("134.021.213-55");

        PedidoCliente pedidoCliente = new PedidoCliente();

        pedidoCliente.setData("04/09/2017");
        pedidoCliente.setItens(listaDeItens);
        pedidoCliente.setCliente(cliente);
        pedidoCliente.setDataEntrega("15/09/2017");

        String txt = "Pedido Cliente: \n";

        txt += pedidoCliente.imprimirDados();

        return txt;

    }

}
