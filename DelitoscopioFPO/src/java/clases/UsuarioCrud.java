/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zaratec
 */
public class UsuarioCrud 
{
    private String error;
    private String error1;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    private Conexion con;
    static ResultSet rst = null;

    public void NuevoUsuario(Usuario usuario) throws SQLException
    {
        PreparedStatement pstm = null;
        error = "";
        error1 = "/UsuarioCrud/NuevoUsuario";
        con=null;
        
        try
        {
            con = new Conexion();
            con.getConnection().setAutoCommit(false);
            pstm = con.getConnection().prepareStatement("INSERT INTO usuarios (id_usu, ci_usu, ape_nom_usu, nic_usu, pas_usu, ema_usu) values (?,?,?,?,?,?)");
            pstm.setInt(1, usuario.getId_usu());
            pstm.setString(2, usuario.getCi_usu());
            pstm.setString(3, usuario.getApe_nom_usu());
            pstm.setString(4, usuario.getNic_usu());
            pstm.setString(5, usuario.getPas_usu());
            pstm.setString(6, usuario.getEma_usu());
            pstm.execute();
            con.getConnection().commit();
        }
        catch (SQLException e) 
        {
            error = e.toString();
            error = error + error1;
            if (con != null) 
            {
                try 
                {
                    con.getConnection().rollback();
                    con.cerrarConexion();
                    
                } 
                catch (SQLException ex) 
                {
                    error = ex.toString();
                    error = error + error1;
                }
            } 
            else 
            {
                error = "Sin conexión a BD/UsuarioCrud/NuevoUsuario";
            }
        } 
        finally 
        {
            if (con != null) 
            {
                con.cerrarConexion();
            }
            try 
            {
                if (pstm!=null) 
                {
                    pstm.close();
                }
            } 
            catch (SQLException e) 
            {
                error = e.toString();
                error = error + error1;
            }
        }    
    }
    
    public void editarUsuario(Usuario usuario) throws SQLException
    {
        PreparedStatement pstm = null;
        error = "";
        error1 = "/UsuarioCrud/editarUsuario";
        con = null;
        try 
        {
            con = new Conexion();
            //Se deshabilita el modo de confirmación automática
            con.getConnection().setAutoCommit(false);
            pstm = con.getConnection().prepareStatement("UPDATE usuarios " +
            "SET ape_nom_usu=?,"+
                 "nic_usu=?,"+
                 "pas_usu=?,"+
                 "ema_usu=?" + 
                 " WHERE id_usu=?");
            
            //pstm = con.getConnection().prepareStatement("UPDATE usuarios SET ape_nom_usu = ?, nic_usu = ?, pas_usu = ?, ema_usu = ? WHERE id_usu = ?");
            pstm.setString(1, usuario.getApe_nom_usu());
            pstm.setString(2, usuario.getNic_usu());
            pstm.setString(3, usuario.getPas_usu());
            pstm.setString(4, usuario.getEma_usu());
            pstm.setInt(5, usuario.getId_usu());
            pstm.execute();
            con.getConnection().commit();
        } 
        catch (SQLException e) 
        {
            error = e.toString();
            error = error + error1;
            if (con != null) 
            {
                try 
                {
                    con.getConnection().rollback();
                } 
                catch (SQLException ex) 
                {
                    error = ex.toString();
                    error = error + error1;
                }
            } 
            else 
            {
                error = "Sin conexión a BD/UsuarioCrud/EditarUsuario";
            }
        } 
        finally 
        {
            if (con != null) 
            {
                con.cerrarConexion();
            }
            try 
            {
                if (pstm!=null) 
                {
                    pstm.close();
                }
            } 
            catch (SQLException e) 
            {
                error = e.toString();
                error = error + error1;
            }
        }    

    }

    public void eliminarUsuario(Usuario usuario) throws SQLException
    {
        PreparedStatement pstm = null;
        error = "";
        error1 = "/UsuarioCrud/eliminarUsuario";
        con = null;
        try 
        {
            con = new Conexion();
            //Se deshabilita el modo de confirmación automática
            con.getConnection().setAutoCommit(false);
            pstm = con.getConnection().prepareStatement("DELETE FROM usuarios WHERE id_usu = ?");
            pstm.setInt(1, usuario.getId_usu());
            pstm.execute();
            con.getConnection().commit();
        } 
        catch (SQLException e) 
        {
            error = e.toString();
            error = error + error1;
            if (con != null) 
            {
                try 
                {
                    con.getConnection().rollback();
                } 
                catch (SQLException ex) 
                {
                    error = ex.toString();
                    error = error + error1;
                }
            } 
            else 
            {
                error = "Sin conexión a BD/UsuarioCrud/EliminarUsuario";
            }
        } 
        finally 
        {
            if (con != null) 
            {
                con.cerrarConexion();
            }
            try 
            {
                if (pstm!=null) 
                {
                    pstm.close();
                }
            } 
            catch (SQLException e) 
            {
                error = e.toString();
                error = error + error1;
            }
        }    

    }
    
    public boolean VerificarExistenciaUsuarios() throws SQLException
    {
        error = "";
        error1 = "/UsuarioCrud/VerificarExistenciaUsuario";

        con = new Conexion();
        rst = con.EjecutarSQLSelect("select COUNT(*) from usuarios");
        rst.next();
        return rst.getInt(1) >0;
    }

    public ResultSet BuscarUsuarios()
    {
        error = "";
        error1 = "/UsuarioCrud/ListarUsuario";

        con = new Conexion();
        rst = con.EjecutarSQLSelect("select * from usuarios");
        return rst;
    }
    
    public int VerificarInicioSesion(String nic_usu, String pas_usu) throws SQLException
    {
        if (nic_usu == "" && pas_usu == "")
        {
            return -1;
        }
        error1 = "/UsuarioCrud/VerificarInicioSesion";
        error = "Usuario o contrasena incorrecto!";

        try
        {
            con = new Conexion();
            rst = con.EjecutarSQLSelect("select COUNT(*) from usuarios");
            rst.next();
            if(rst.getInt(1)>0)
            {
                rst = con.EjecutarSQLSelect("select id_usu from usuarios where nic_usu = '" + nic_usu + "' and pas_usu = '" + pas_usu + "'");
                while(rst.next())
                {
                    error = "";
                    return rst.getInt("id_usu");
                }
            }
            else
            {
                    error = "sin usuarios";
                    return -1;
            }
        }
        catch (SQLException e) 
        {
            con.cerrarConexion();
            error = e.toString();
            error = error + error1;
            return -1;
        } 
        return -1;
    }

}

    