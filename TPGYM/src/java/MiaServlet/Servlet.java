package MiaServlet;

import MioBean.Bean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import MySql.MySql;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    throws ServletException, IOException {
        /* Salvo le Variabili che invierò al bean */
        MySql DB = null;
        String nome = req.getParameter("nome");
        String cognome = req.getParameter("cognome");
        String mail = req.getParameter("mail");
        /* Controllo che le variabili non siano vuote */
        if(nome.isEmpty() || cognome.isEmpty() || mail.isEmpty()){
                req.getRequestDispatcher("/index.html").forward(req, resp);
        }else{
            /* Creo l'oggetto bean e inserisco i dati */
            Bean dati = new Bean();
            dati.setNome(nome);
            dati.setCognome(cognome);
            dati.setMail(mail);
            /* Crea una connessione tramite il JDBC */
            try{
                DB = new MySql("datis");
                DB.exQuery(dati.getNome(), dati.getCognome(), dati.getMail());
                DB.closeConn();
            }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            };
            /* Invio i dati alla jsp */
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
        
    } 
}