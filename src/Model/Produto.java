/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Fornecedor;

/**
 *
 * @author Lavínia Félix
 */
public class Produto {
    
    private int cod_prod;
    private String nome_prod;
    private double preco_prod;
    private int cod_fornec;

    public Produto(int cod_prod, String nome_prod, double preco_prod, int cod_fornec) {
        this.cod_prod = cod_prod;
        this.nome_prod = nome_prod;
        this.preco_prod = preco_prod;
        this.cod_fornec = cod_fornec;
    }

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Produto(int cod_prod, String nome_prod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public double getPreco_prod() {
        return preco_prod;
    }

    public void setPreco_prod(double preco_prod) {
        this.preco_prod = preco_prod;
    }

    public int getCod_fornec() {
        return cod_fornec;
    }

    public void setCod_fornec(int cod_fornec) {
        this.cod_fornec = cod_fornec;
    }
    
    @Override
    public String toString() {
    	return "Produto [ID Produto=" + cod_prod + ", Produto=" + nome_prod 
                + ", Preço=" + preco_prod + ", Fornecedor=" + cod_fornec + "]" + "\n";
    }
    
}
