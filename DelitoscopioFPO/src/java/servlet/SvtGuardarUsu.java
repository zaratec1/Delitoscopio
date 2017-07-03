/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import clases.Usuario;
import clases.UsuarioCrud;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zaratec
 */
public class SvtGuardarUsu extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SvtGuardarUsu</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet SvtGuardarUsu at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }
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
//        response.setContentType("application/json");  // Set content type of the response so that jQuery knows what it can expect.
//        response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
        response.setContentType("text/html;charset=UTF-8");

        String serror;
        String ci_usu = request.getParameter("ci_usu");
        String ape_nom_usu = request.getParameter("ape_nom_usu");
        String nic_usu = request.getParameter("nic_usu");
        String pas_usu = request.getParameter("pas_usu");
        String ema_usu = request.getParameter("ema_usu");
        

        Usuario u = new Usuario(ci_usu, ape_nom_usu, nic_usu, pas_usu,ema_usu);
        UsuarioCrud Grabar = new UsuarioCrud();

        try 
        {
            Grabar.NuevoUsuario(u);
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
