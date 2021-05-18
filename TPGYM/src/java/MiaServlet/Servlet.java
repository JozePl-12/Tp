/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiaServlet;

import MioBean.Bean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author webep
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String cognome = req.getParameter("cognome");
        String mail = req.getParameter("mail");
        if(nome.isEmpty() || cognome.isEmpty() || mail.isEmpty()){
                req.getRequestDispatcher("/index.html").forward(req, resp);
        }else{
            Bean dati = new Bean();
            dati.setNome(nome);
            dati.setCognome(cognome);
            dati.setMail(mail);
            req.getServletContext().getRequestDispatcher("/index.jsp").
                forward(req, resp);
        }
        
    } 
}