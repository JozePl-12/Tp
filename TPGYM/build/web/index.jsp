<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TPGYM</title>
        <link rel="stylesheet" href="Risorse/style.css"/>
        <meta charset="windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <jsp:useBean class="MioBean.Bean" id="dati" scope="request">
            <jsp:setProperty name="dati" property="*" />
        </jsp:useBean>
        <center>
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
                                    <center>
                                            <label><jsp:getProperty name="dati" property="nome"/></label>
                                            <label><jsp:getProperty name="dati" property="cognome"/></label>
                                            <label><jsp:getProperty name="dati" property="mail"/></label>
                                    </center>
                                </td>
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
                    <td style="width:70%;">
                        <img src="Risorse/im1.png"/>
                    </td>
                    <td style="background-color: white;
                        border-radius: 400em; width: 20%;">
                        <p>
                            <center>
                                Ciao <jsp:getProperty name="dati" property="nome"/> 
                                <jsp:getProperty name="dati" property="cognome"/> io sono the rock,<br>
                                allenati per diventare come me.<br>
                                TI INVIER&Oacute; PRESTO UNA MAIL AL TUO INDIRIZZO:  
                                <jsp:getProperty name="dati" property="mail"/>
                            </center>
                        </p>
                    </td>
                </tr>
            </table>
        </center>
    </body>
</html>
