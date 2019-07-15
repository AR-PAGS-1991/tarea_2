package Principal;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class BaseDatos {
public static Connection Conexion;     
public static void AbrirConexionDB() {
    String URL     = "jdbc:derby://localhost:1527/HUMANO";      //
    String Driver  = "org.apache.derby.jdbc.ClientDriver";
    String Usuario = "UTH";
    String Clave   = "UTH";
    try {
    Class.forName(Driver);  
    Conexion = DriverManager.getConnection(URL, Usuario, Clave);
        System.out.println("conectado");
      }
    catch(Exception e){
     JOptionPane.showMessageDialog(null,"Error:"
             + e.getMessage());
     System.exit(0);
    } 
    }  
public static void CerrarConexion(){
     Conexion = null;
    }


}