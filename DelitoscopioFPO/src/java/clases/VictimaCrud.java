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
public class VictimaCrud
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

    public void NuevaVictima(Victima victima) throws SQLException
    {
        PreparedStatement pstm = null;
        error = "";
        error1 = "/VictimaCrud/NuevaVictima";
        con=null;
        
        try
        {
            con = new Conexion();
            con.getConnection().setAutoCommit(false);
            pstm = con.getConnection().prepareStatement("INSERT INTO victimas (id_vic, doc_vic, ci_pas_vic, ape_vic, nom_vic, eda_vic, may_men_vic, ema_usu, gen_vic, etn_vic, niv_eco_vic, niv_edu_vic, id_usu) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setInt(1, victima.getId_vic());
            pstm.setInt(2, victima.getDoc_vic());
            pstm.setString(3, victima.getCi_pas_vic());
            pstm.setString(4, victima.getApe_vic());
            pstm.setString(5, victima.getNom_vic());
            pstm.setInt(6, victima.getEda_vic());
            pstm.setInt(7, victima.getMay_men_vic());
            pstm.setString(8, victima.getEma_vic());
            pstm.setString(9, victima.getGen_vic());
            pstm.setString(10, victima.getEtn_vic());
            pstm.setString(11, victima.getNiv_eco_vic());
            pstm.setString(12, victima.getNiv_edu_vic());
            pstm.setInt(13, victima.getId_usu());
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
                error = "Sin conexión a BD/VictimaCrud/NuevaVictima";
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
    
    public void editarVictima(Victima victima) throws SQLException
    {
        PreparedStatement pstm = null;
        error = "";
        error1 = "/VictimaCrud/editarVictima";
        con = null;
        try 
        {
            con = new Conexion();
            //Se deshabilita el modo de confirmación automática
            con.getConnection().setAutoCommit(false);
            pstm = con.getConnection().prepareStatement("UPDATE victimas " +
            "SET doc_vic=?,"+
                 "ci_pas_vic=?,"+
                 "ape_vic=?,"+
                 "nom_vic=?" + 
                 "eda_vic=?" + 
                 "may_men_vic=?" + 
                 "ema_vic=?" + 
                 "gen_vic=?" + 
                 "etn_vic=?" + 
                 "niv_eco_vic=?" + 
                 "niv_edu_vic=?" + 
                 "id_usu=?" + 
                 " WHERE id_vic=?");
            
            pstm.setInt(1, victima.getDoc_vic());
            pstm.setString(2, victima.getCi_pas_vic());
            pstm.setString(3, victima.getApe_vic());
            pstm.setString(4, victima.getNom_vic());
            pstm.setInt(5, victima.getEda_vic());
            pstm.setInt(6, victima.getMay_men_vic());
            pstm.setString(7, victima.getEma_vic());
            pstm.setString(8, victima.getGen_vic());
            pstm.setString(9, victima.getEtn_vic());
            pstm.setString(10, victima.getNiv_eco_vic());
            pstm.setString(11, victima.getNiv_edu_vic());
            pstm.setInt(12, victima.getId_usu());
            pstm.setInt(13, victima.getId_vic());
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
                error = "Sin conexión a BD/VictimaCrud/EditarVictima";
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

    public void eliminarVictima(Victima victima) throws SQLException
    {
        PreparedStatement pstm = null;
        error = "";
        error1 = "/VictimaCrud/eliminarVictima";
        con = null;
        try 
        {
            con = new Conexion();
            //Se deshabilita el modo de confirmación automática
            con.getConnection().setAutoCommit(false);
            pstm = con.getConnection().prepareStatement("DELETE FROM victimas WHERE id_vic = ?");
            pstm.setInt(1, victima.getId_vic());
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
                error = "Sin conexión a BD/VictimaCrud/EliminarVictima";
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
    
    public boolean VerificarExistenciaVictima() throws SQLException
    {
        error = "";
        error1 = "/VictimaCrud/VerificarExistenciaVictima";

        con = new Conexion();
        rst = con.EjecutarSQLSelect("select COUNT(*) from victimas");
        rst.next();
        return rst.getInt(1) >0;
    }

    public ResultSet BuscarVictimas()
    {
        error = "";
        error1 = "/VictimaCrud/BuscarVictima";

        con = new Conexion();
        rst = con.EjecutarSQLSelect("select * from victimas");
        return rst;
    }
    
}

    