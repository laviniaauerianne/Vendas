/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;

/**
 *
 * @author Lavínia Félix
 */
public class Estoque {
    
    private CadastroProdutos prods;

    public Estoque(CadastroProdutos prods) {
        this.prods = prods;
    }

    public Estoque() {
    }
    

    //@Override
    public String listaProdutoEstoque() {
        return "Produto [Produto = " + prods + "]" + "\n";
    }
}
