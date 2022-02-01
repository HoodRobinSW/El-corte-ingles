package DAO;

import com.myapp.struts.Login;
import com.myapp.struts.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bd {

    private static String usuario = "alejdnxu";
    private static String password = "hFWucoCz1K26";
    private static String servidor = "localhost:3306";
    private static String basedatos = "elCorteIngles";

    public static Connection CrearConexion() {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //invocamos al driver
            String url = "jdbc:mysql://" + servidor + "/" + basedatos;
            cnn = DriverManager.getConnection(url, usuario, password); //nos conectamos a la BD
        } catch (ClassNotFoundException c) {
            System.out.println("Controlador JDBC no encontrado" + c.toString());
        } catch (SQLException ex) {
            System.out.println("Fallo en la conexion" + ex.toString());
        }
        return cnn;
    }
    
    public static void insertarUsuario(Usuario usuario) throws SQLException {
        Connection conn = CrearConexion();
        String sql = "INSERT INTO usuarios VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, 0);
        ps.setString(2, usuario.getEmail());
        ps.setString(3, usuario.getPass());
        ps.setString(4, usuario.getNombre());
        ps.setString(5, usuario.getApellidos());
        ps.setString(6, usuario.getNif());
        ps.setString(7, usuario.getProvincia());
        ps.setString(8, usuario.getMunicipio());
        ps.setString(9, usuario.getTelefono());
        ps.setBoolean(10, usuario.isPublicidad());
        ps.executeUpdate();
    }
    
    public static boolean esteUsuarioExiste(Usuario usuario) throws SQLException {
        boolean existe = false;
        Connection conn = CrearConexion();
        String sql = "SELECT * FROM usuarios WHERE telefono='"+usuario.getTelefono()+"';";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        existe = rs.next();
        
        return existe;
    }
    
    public static boolean buscarUsuarioPorTelefono(String telefono) throws SQLException {
        boolean encontrado = false;
        Connection conn = CrearConexion();
        String sql = "SELECT * FROM usuarios WHERE telefono='"+telefono+"';";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        encontrado = rs.next();
        
        return encontrado;
    }
    
    public static boolean logearUsuario(Login login) throws SQLException {
        Connection conn = CrearConexion();
        String sql = "SELECT * FROM usuarios WHERE telefono='"+login.getTelefono()+"' AND password='"+login.getPassword()+"';";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
                
        return rs.next();
    }
    
}
