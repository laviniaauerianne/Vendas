/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lavínia Félix
 */
public class Fornecedor {
    
    private int id_fornec;
    private String nome_fornec;

    public Fornecedor() {
    }
    
    public Fornecedor(int id_fornec, String nome_fornec) {
        this.id_fornec = id_fornec;
        this.nome_fornec = nome_fornec;
    }

    public int getId_fornec() {
        return id_fornec;
    }

    public void setId_fornec(int id_fornec) {
        this.id_fornec = id_fornec;
    }

    public String getNome_fornec() {
        return nome_fornec;
    }

    public void setNome_fornec(String nome_fornec) {
        this.nome_fornec = nome_fornec;
    }
    
    @Override
    public String toString() {
    	return "Fornecedor [ID Fornecedor=" + id_fornec + ", Fornecedor=" + nome_fornec + "]" + "\n";
    }
}
