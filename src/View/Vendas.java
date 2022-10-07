/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CadastroCliente;
import Controller.CadastroFornecedor;
import Controller.CadastroProdutos;
import Controller.CadastroVenda;
import Controller.Estoque;
import Model.Cliente;

/**
 *
 * @author Lavínia Félix
 */
public class Vendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadastroCliente cli[] = new CadastroCliente[3];
        CadastroFornecedor forn[] = new CadastroFornecedor[3];
        CadastroProdutos prod[] = new CadastroProdutos[3];
        CadastroVenda venda[] = new CadastroVenda[3];
        Estoque est[] = new Estoque[3];

        cli[0] = new CadastroCliente(1, "Lavinia Felix");
        cli[1] = new CadastroCliente(2, "Joao Costa");
        cli[2] = new CadastroCliente(3, "Maria Fernandes");

        System.out.println("CLIENTES");
        for (int a = 0; a <= cli.length - 1; a++) {
            System.out.println(cli[a].toString());
        }
        System.out.println();

        forn[0] = new CadastroFornecedor(4, "Jose Carnes LTDA");
        forn[1] = new CadastroFornecedor(5, "Santa Gula doces LTDA");
        forn[2] = new CadastroFornecedor(6, "Manel Alimentos LTDA");
        
        System.out.println("FORNECEDORES");
        for (int a = 0; a <= forn.length - 1; a++) {
            System.out.println(forn[a].toString());
        }
        System.out.println();
        
        prod[0] = new CadastroProdutos(7, "Krokerus", 2.50, 5);
        prod[1] = new CadastroProdutos(8, "Arroz Tio João", 25.99, 6);
        prod[2] = new CadastroProdutos(9, "Feijao", 12.50, 6);
        
        System.out.println("ESTOQUE");
        for (int a = 0; a <= prod.length - 1; a++) {
            System.out.println(prod[a].toString());
        }
        
        double soma_estoque = 0;

        for (int a = 0; a <= prod.length - 1; a++) {
            soma_estoque += prod[a].getPreco_prod();
        }
        
        
        System.out.println("---------------Total do estoque = " + soma_estoque + "-----------------");
        
        System.out.println();
        
        venda[0] = new CadastroVenda(cli[0] , prod[1]);
        venda[1] = new CadastroVenda(cli[0], prod[2]);
        
        System.out.println("MOVIMENTAÇÃO DE VENDAS");
        for (int b = 0; b <= venda.length - 1; b++) {
            System.out.println(venda[b].toString());
            
        }
    }

}
