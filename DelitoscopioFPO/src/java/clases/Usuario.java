/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author zaratec
 */
public class Usuario 
{
    
    
    public Usuario(int id_usu, String ci_usu, String ape_nom_usu, String nic_usu, String pas_usu, String ema_usu) {
        this.id_usu = id_usu;
        this.ci_usu = ci_usu;
        this.ape_nom_usu = ape_nom_usu;
        this.nic_usu = nic_usu;
        this.pas_usu = pas_usu;
        this.ema_usu = ema_usu;
    }

    public Usuario(String ci_usu, String ape_nom_usu, String nic_usu, String pas_usu, String ema_usu) {
        this.ci_usu = ci_usu;
        this.ape_nom_usu = ape_nom_usu;
        this.nic_usu = nic_usu;
        this.pas_usu = pas_usu;
        this.ema_usu = ema_usu;
    }
    
    private int id_usu;

    public Usuario() 
    {
        super();
    }

    public Usuario(int id_usu) 
    {
        this.id_usu = id_usu;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }
    
    private String ci_usu;

    public String getCi_usu() {
        return ci_usu;
    }

    public void setCi_usu(String ci_usu) {
        this.ci_usu = ci_usu;
    }

    public String getApe_nom_usu() {
        return ape_nom_usu;
    }

    public void setApe_nom_usu(String ape_nom_usu) {
        this.ape_nom_usu = ape_nom_usu;
    }

    public String getNic_usu() {
        return nic_usu;
    }

    public void setNic_usu(String nic_usu) {
        this.nic_usu = nic_usu;
    }

    public String getPas_usu() {
        return pas_usu;
    }

    public void setPas_usu(String pas_usu) {
        this.pas_usu = pas_usu;
    }

    public String getEma_usu() {
        return ema_usu;
    }

    public void setEma_usu(String ema_usu) {
        this.ema_usu = ema_usu;
    }
    private String ape_nom_usu;
    private String nic_usu;
    private String pas_usu;
    private String ema_usu;
    
    
}
