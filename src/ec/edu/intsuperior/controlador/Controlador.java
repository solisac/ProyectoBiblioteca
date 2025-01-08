/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.*;

/**
 *
 * @author Santiago
 */
public class Controlador {
    Loggin loggin = new Loggin(this);
    Administrador administrador = new Administrador(this);
    
    
    public void getLoggin(){
        loggin.setVisible(true);
        administrador.setVisible(false);
    }
    public void getAdministrador(){
        administrador.setVisible(true);
        loggin.setVisible(false);
    }
    
}
