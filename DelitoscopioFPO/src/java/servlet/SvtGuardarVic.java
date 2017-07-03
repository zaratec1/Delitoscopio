/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import clases.Victima;
import clases.VictimaCrud;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zaratec
 */
public class SvtGuardarVic extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) 
//        {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SvtGuardarVic</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet SvtGuardarVic at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    
        
        response.setContentType("text/html;charset=UTF-8");

        String serror;
        int doc_vic = Integer.parseInt(request.getParameter("doc_vic"));
        String ci_pas_vic = request.getParameter("ci_pas_vic");
        String ape_vic = request.getParameter("ape_vic");
        String nom_vic = request.getParameter("nom_vic");
        int eda_vic = Integer.parseInt(request.getParameter("eda_vic"));
        int maymen = 0;
        if (eda_vic > 17)
        {
            maymen = 1;
        }
        String ema_vic = request.getParameter("ema_vic");
        String gen_vic = request.getParameter("gen_vic");
        String etn_vic = request.getParameter("etn_vic");
        String niv_eco_vic = request.getParameter("niv_eco_vic");
        String niv_edu_vic = request.getParameter("niv_edu_vic");
        int id_usu = Integer.parseInt(request.getParameter("id_usu"));
        

        Victima v = new Victima(doc_vic, ci_pas_vic, ape_vic, nom_vic, eda_vic, maymen, ema_vic, gen_vic, etn_vic, niv_eco_vic, niv_edu_vic, id_usu);
        VictimaCrud Grabar = new VictimaCrud();

        try 
        {
            Grabar.NuevaVictima(v);
            if ("".equals(Grabar.getError()))
            {
                serror = "Guardado correctamente";
                response.getWriter().write(serror);       // Write response body.        
            }
            else
            {
                serror = Grabar.getError();
                response.getWriter().write(serror);       // Write response body.        
            }
        } 
        catch (SQLException ex) 
        {
            serror = ex.toString();
            response.getWriter().write(serror);       // Write response body.        
        }
        
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
