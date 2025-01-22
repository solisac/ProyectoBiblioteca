
package ec.edu.intsuperior.modelo;

import ec.edu.intsuperior.controlador.Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {

    public String url = "jdbc:mysql://localhost:3306/registro?serverTimezone=UTC";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "root";
    
    Controlador controlador;
    
    public Conexion(Controlador controlador){
        this.controlador=controlador;
    }
    
    public Connection conectar() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null,"conexion exitosa");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
    public void cerrarConexion(){
        try {
            conectar().close();
            JOptionPane.showMessageDialog(null,"cierre de conexion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
