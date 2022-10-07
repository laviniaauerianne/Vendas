/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Produto;
import Model.Fornecedor;
import Model.Cliente;

/**
 *
 * @author Lavínia Félix
 */
public class Venda {
    
    private Cliente cliente;
    private Produto produto;

    public Venda(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    public String getCliente() {
        return cliente.getCliente();
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto.getNome_prod();
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
