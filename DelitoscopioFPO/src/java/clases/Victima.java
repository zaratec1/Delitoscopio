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
public class Victima 
{
    private int id_vic;
    private int doc_vic;
    private String ci_pas_vic;
    private String ape_vic;
    private String nom_vic;
    private int eda_vic;
    private int may_men_vic;
    private String ema_vic;
    private String gen_vic;
    private String etn_vic;
    private String niv_eco_vic;
    private String niv_edu_vic;
    private int id_usu;

    public int getId_vic() {
        return id_vic;
    }

    public void setId_vic(int id_vic) {
        this.id_vic = id_vic;
    }

    public int getDoc_vic() {
        return doc_vic;
    }

    public void setDoc_vic(int doc_vic) {
        this.doc_vic = doc_vic;
    }

    public String getCi_pas_vic() {
        return ci_pas_vic;
    }

    public void setCi_pas_vic(String ci_pas_vic) {
        this.ci_pas_vic = ci_pas_vic;
    }

    public String getApe_vic() {
        return ape_vic;
    }

    public void setApe_vic(String ape_vic) {
        this.ape_vic = ape_vic;
    }

    public String getNom_vic() {
        return nom_vic;
    }

    public void setNom_vic(String nom_vic) {
        this.nom_vic = nom_vic;
    }

    public int getEda_vic() {
        return eda_vic;
    }

    public void setEda_vic(int eda_vic) {
        this.eda_vic = eda_vic;
    }

    public int getMay_men_vic() {
        return may_men_vic;
    }

    public void setMay_men_vic(int may_men_vic) {
        this.may_men_vic = may_men_vic;
    }

    public String getEma_vic() {
        return ema_vic;
    }

    public void setEma_vic(String ema_vic) {
        this.ema_vic = ema_vic;
    }

    public String getGen_vic() {
        return gen_vic;
    }

    public void setGen_vic(String gen_vic) {
        this.gen_vic = gen_vic;
    }

    public String getEtn_vic() {
        return etn_vic;
    }

    public void setEtn_vic(String etn_vic) {
        this.etn_vic = etn_vic;
    }

    public String getNiv_eco_vic() {
        return niv_eco_vic;
    }

    public void setNiv_eco_vic(String niv_eco_vic) {
        this.niv_eco_vic = niv_eco_vic;
    }

    public String getNiv_edu_vic() {
        return niv_edu_vic;
    }

    public void setNiv_edu_vic(String niv_edu_vic) {
        this.niv_edu_vic = niv_edu_vic;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public Victima()
    {
    }
    
    public Victima(int doc_vic, String ci_pas_vic, String ape_vic, String nom_vic, int eda_vic, int may_men_vic, String ema_vic, String gen_vic, String etn_vic, String niv_eco_vic, String niv_edu_vic, int id_usu) 
    {
        this.doc_vic = doc_vic;
        this.ci_pas_vic = ci_pas_vic;
        this.ape_vic = ape_vic;
        this.nom_vic = nom_vic;
        this.eda_vic = eda_vic;
        this.may_men_vic = may_men_vic;
        this.ema_vic = ema_vic;
        this.gen_vic = gen_vic;
        this.etn_vic = etn_vic;
        this.niv_eco_vic = niv_eco_vic;
        this.niv_edu_vic = niv_edu_vic;
        this.id_usu = id_usu;
    }

    public Victima(int id_vic, int doc_vic, String ci_pas_vic, String ape_vic, String nom_vic, int eda_vic, int may_men_vic, String ema_vic, String gen_vic, String etn_vic, String niv_eco_vic, String niv_edu_vic, int id_usu) 
    {
        this.id_vic = id_vic;
        this.doc_vic = doc_vic;
        this.ci_pas_vic = ci_pas_vic;
        this.ape_vic = ape_vic;
        this.nom_vic = nom_vic;
        this.eda_vic = eda_vic;
        this.may_men_vic = may_men_vic;
        this.ema_vic = ema_vic;
        this.gen_vic = gen_vic;
        this.etn_vic = etn_vic;
        this.niv_eco_vic = niv_eco_vic;
        this.niv_edu_vic = niv_edu_vic;
        this.id_usu = id_usu;
    }
}
