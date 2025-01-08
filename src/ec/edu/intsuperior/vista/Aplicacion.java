/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Controlador;
import ec.edu.intsuperior.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class Aplicacion {
    public static void main(String[] args) {
        Controlador controlador= new Controlador();
        controlador.getLoggin();
        
        
//        Usuario usr1=new Usuario();
//        Usuario usr2=new Usuario(1,"ssolis","qwerty");
//        
//        usr1.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un id")));
//        usr1.setNombreUsuario(JOptionPane.showInputDialog("Ingresa el nombre del usuario"));
//        
//        System.out.println(usr1.getNombreUsuario());
    }
    
}
