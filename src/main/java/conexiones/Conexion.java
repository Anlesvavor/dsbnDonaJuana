package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conn = null;
    private static Conexion conexion;

    private Conexion() throws SQLException, ClassNotFoundException {
        this.createConexion();
    }

    public static Conexion getInstance() throws SQLException, ClassNotFoundException{
        if (conexion == null){
            conexion = new Conexion();
        }
        return conexion;
    }

    private void createConexion() throws SQLException, ClassNotFoundException{
        /*
        String urlDatabase = "jdbc:mysql://localhost:3306/hr2";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                urlDatabase,"root","root");

        */

        //Localización de la clase en el archivo .jar
        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tienda?useSSL=false&serverTimezone=UTC",
                "root",
                "root");
    }

    public Connection getConnecion(){
        return conn;
    }
}
