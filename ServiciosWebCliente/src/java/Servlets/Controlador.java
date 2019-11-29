package Servlets;

import Modelo.notas;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    String ingresar = "Ingresar.jsp";
    String index = "index.jsp";
    String maximo = "MyM.jsp";
    String prom = "Prom.jsp";
    String acceso = "";
    
    notas nota = new notas();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        if (accion.equals("Ingresar")){
            acceso = ingresar;
        }else if(accion.equals("Registrar")){
            String nt = request.getParameter("txtnota");
            nota.insetar(Integer.parseInt(nt));
            acceso = index;
        }else if(accion.equals("index")){
            acceso = index;
        }else if(accion.equals("MaxyMin")){
            acceso = maximo;
        }else if(accion.equals("Prom")){
            acceso = prom;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        dispatcher.forward(request, response);
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
            throws ServletException, IOException {
        processRequest(request, response);
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
