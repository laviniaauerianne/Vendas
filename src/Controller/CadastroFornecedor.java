/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Fornecedor;

/**
 *
 * @author Lavínia Félix
 */
public class CadastroFornecedor {

    private int id_fornec;
    private String nome_fornec;

    public CadastroFornecedor(int id_fornec, String nome_fornec) {
        this.id_fornec = id_fornec;
        this.nome_fornec = nome_fornec;
    }

    public void insereFornecedor() {
        Fornecedor f = new Fornecedor(id_fornec, nome_fornec);
    }

    //@Override
    public String toString() {
        return "Fornecedor [ID Fornecedor = " + id_fornec + ", Fornecedor = " + nome_fornec + "]" + "\n";
    }

}
