/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package practica11;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aula 403
 */
@WebServlet(name = "Update", urlPatterns = {"/Update"})
public class Update1 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Update</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Update at " + request.getContextPath() + "</h1>");
                       String fn = request.getParameter("fn");
                       String ln = request.getParameter("ln");
                       String nfn = request.getParameter("nfn");
            try
                {
                  // create a mysql database connection
                  String myDriver = "com.mysql.cj.jdbc.Driver";
                  String myUrl = "jdbc:mysql://localhost/practicas";
                  Class.forName(myDriver);
                try (Connection conn = DriverManager.getConnection(myUrl, "root", "weirdgorilla38")) {
                    //DbConnection conn =  new DbConnection();
                     //Connection condb = conn.getDbConnected();
                     Statement st = conn.createStatement();
                    String qry = "Update users SET first_name ='"+ nfn + "', last_name = '"+ ln + "'" + "WHERE first_name = '"+ fn + "'"; 
                    System.out.println("******************* " + qry);
                    
                    // note that i'm leaving "date_created" out of this insert statement
                    st.executeUpdate(qry);
                }
                }
                catch (Exception e)
                {
                  System.err.println("Got an exception!");
                  System.err.println(e.getMessage());
                }
            out.println("</body>");
            out.println("</html>");
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