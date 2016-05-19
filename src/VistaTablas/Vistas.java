/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaTablas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raffi
 */
public class Vistas {
    
    public DefaultTableModel ModeloCliPro(String consulta){   
        DefaultTableModel modelo=new DefaultTableModel();
        if(consulta.equals("cliente")){
            modelo.addColumn("Cliente");
        }else{
            modelo.addColumn("Proveedor");
        }
        
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("RFC");
        modelo.addColumn("Correo");
        modelo.addColumn("Dominio");
        return modelo;        
    }
    
    public DefaultTableModel ModeloMant(){        
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Cliente");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("RFC");
        modelo.addColumn("Correo");
        modelo.addColumn("Dominio");
        return modelo;        
    }
    
    public DefaultTableModel ModeloMat(){        
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Cliente");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("RFC");
        modelo.addColumn("Correo");
        modelo.addColumn("Dominio");
        return modelo;        
    }
    
    public DefaultTableModel ModeloPza(){        
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Cliente");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("RFC");
        modelo.addColumn("Correo");
        modelo.addColumn("Dominio");
        return modelo;        
    }
    
    public DefaultTableModel ModeloOC(){
        DefaultTableModel titulo_tabla=new DefaultTableModel();
        titulo_tabla.addColumn("Fecha");
        titulo_tabla.addColumn("Empresa");
        titulo_tabla.addColumn("Pieza");
        titulo_tabla.addColumn("Cantidad");
        titulo_tabla.addColumn("Subtotal");
        titulo_tabla.addColumn("Iva");
        titulo_tabla.addColumn("Total");
        return titulo_tabla;
    }
    
}
