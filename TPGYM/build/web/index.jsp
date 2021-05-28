<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="MySql.MySql"%>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%
    MySql DB = null;
    ResultSet set = null;
%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Inserisco il titolo della pagina, mostrato in alto nella scheda -->
        <title>TPGYM</title>
        <!-- Creo il collegamento al css -->
        <link rel="stylesheet" href="Risorse/style.css"/> 
        <meta charset="windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <!-- Creo il collegamento con il bean -->
        <jsp:useBean class="MioBean.Bean" id="dati" scope="request">
            <jsp:setProperty name="dati" property="*" />
        </jsp:useBean>
        <center>
            <!-- Inserisco la tabella con classi dati nello style -->
            <table class="TableA">
                <tr class="DiscoverTR">
                    <td>
                        <center>
                            <a class="DiscoverA">Discover Your Worth</a>
                        </center>
                    </td>
                </tr>
            </table>
        </center>
        <center>
            <table class="TableNormal">
                <tr>
                    <td>
                        <table class="TableF">
                            <tr>
                                <td style="width: 97%">
                                </td>
                                <!-- Inserisco la foto del manubrio che ruota -->
                                <td style="width: 3%;">
                                    <img class="rotate" src="Risorse/manub.png">
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
            <table class="tableAll">
                <tr>
                    <!-- Metto degli attributi per il css, contenenti lunghezza e bordis -->
                    <td style="background-color: rgba(143, 141, 136, 0.6);
                        width: 100%; height: 600px;">
                        <%
                            try{
                                try{
                                    DB = new MySql("datis");
                                    set = DB.exReturn("select * from dati;");
                                }catch (ClassNotFoundException | SQLException ex) {
                                    Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                while(set.next()){
                        %>
                        <center>
                            <a style="color: white; font-size: 25px; font-family: gym;">
                                <%=set.getString("nome") %>
                            </a><a style="color: white; font-size: 25px; font-family: gym;">
                                <%=set.getString("cogn") %>
                            </a><a style="color: white; font-size: 25px; font-family: gym;">
                                <%=set.getString("mail") %>
                            </a>
                        </center>
                        <%
                            }
                            DB.closeConn();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %>
                    </td>
                </tr>
            </table>
        </center>
    </body>
</html>
