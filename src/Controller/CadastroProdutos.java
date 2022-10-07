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
public class CadastroProdutos {

    private int cod_prod;
    private String nome_prod;
    private double preco_prod;
    private int cod_fornec;

    public CadastroProdutos(int cod_prod, String nome_prod, double preco_prod, int cod_fornec) {
        this.cod_prod = cod_prod;
        this.nome_prod = nome_prod;
        this.preco_prod = preco_prod;
        this.cod_fornec = cod_fornec;
    }

    CadastroProdutos(int id_prod, String nome_prod, double valor) {
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public double getPreco_prod() {
        return preco_prod;
    }

    public int getCod_fornec() {
        return cod_fornec;
    }
    
    
    
    public void insereProduto() {
        Produto p = new Produto(cod_prod, nome_prod, preco_prod, cod_fornec);
    }

    //@Override
    public String toString() {
        return "Produto [ID Produto = " + cod_prod + ", Produto = " + nome_prod
                + ", Preço = " + preco_prod + ", Fornecedor = " + cod_fornec + "]" + "\n";
    }
}
