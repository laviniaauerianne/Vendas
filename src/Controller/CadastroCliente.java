/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;

/**
 *
 * @author Lavínia Félix
 */
public class CadastroCliente  {
    
    private int id_cliente;
    private String cliente;
    
     public CadastroCliente(int id_cliente, String cliente) {
        this.id_cliente = id_cliente;
        this.cliente = cliente;
    }
     
    public CadastroCliente(){
        
    }
     
    public void insereCliente(){
        Cliente c = new Cliente(id_cliente, cliente);
    }
    
    //@Override
    public String toString() {
    	return "Cliente [ID Cliente = " + id_cliente + ", Cliente = " + cliente + "]" + "\n";
    }
    
}
