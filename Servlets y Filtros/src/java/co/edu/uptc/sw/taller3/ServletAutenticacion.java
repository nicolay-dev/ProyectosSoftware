/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw.taller3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dreyk
 */
@WebServlet(name = "ServletAutenticacion", urlPatterns = {"/ServletAutenticacion"})
public class ServletAutenticacion extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Prueba</title>");
            out.println("</head>");
            out.println("<body>");
            String usuario = req.getParameter("usuario");
            String contraseña  = req.getParameter("psswd");
            if (usuario.equalsIgnoreCase(contraseña)) {    
                HttpSession session = req.getSession();
                session.setAttribute("usuario", usuario);
            }resp.sendRedirect("filtro/Sesion.html");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
}
