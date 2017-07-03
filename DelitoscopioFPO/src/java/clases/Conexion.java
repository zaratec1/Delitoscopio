/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zaratec
 */
public class Conexion 
{


    public static String bd="bd_delitoscopiofpo";
    public static String login="root";
    public static String password="kris211079";
    public static String url="jdbc:mysql://localhost/"+bd;
    private Connection conexion = null;

    public String getError() {
        return Error;
    }

    public void setError(String Error) {
        this.Error = Error;
    }
    
    public String Error = "";
    
    public Conexion()
    {
        Error = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, password);
        }
        catch (SQLException e)
        {
            Error = "Error en el jdbc, Conexion/Conexion/L35,35";
        } 
        catch (ClassNotFoundException ex) {
            Error = "Error en el driver, Conexion/Conexion/L34,35";
        }
    }
    
    public Connection getConnection()
    {
        return conexion;
    }
    

    public void cerrarConexion() {
        try 
        {
            conexion.close();
        } 
        catch (SQLException ex) 
        {
            Error = "La conexión no cerro correctamente, Conexion/cerrarConexion/L54"+ex.toString();
        }
    }

    public ResultSet EjecutarSQLSelect(String sql) {
        ResultSet resultado;
        try 
        {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            resultado = pstm.executeQuery();
            return resultado;
        } 
        catch (SQLException ex) 
        {
            Error = ex.toString();
            return null;
        }
    }


    
    
}
