/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Venda;

/**
 *
 * @author Lavínia Félix
 */
public class CadastroVenda {

    private CadastroCliente result_cliente;
    private CadastroProdutos result_produto;

    public CadastroVenda(CadastroCliente result_cliente, CadastroProdutos result_produto) {
        this.result_cliente = result_cliente;
        this.result_produto = result_produto;
    }

    @Override
    public String toString() {
        return "Vendas [Cliente = " + result_cliente + ", Produto comprado = " + result_produto + "]" + "\n" + "\n";
    }
}
