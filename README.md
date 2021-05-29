#Work in progress: Servlet che riceve dati da una form html, li processa e restituisce il bmi, salvando il tutto in un database;

<16/05/2021> Ho creato la pagina index.html, contenente la form(nome, cognome, altezza, età, peso); 
La pagina contiene ancora un errore riguardante il background;
Errore nella creazione delle classi java.

<18/05/2021> Problema relativo ai getter e setter della jsp, Error(500), Risolto tramite la corretta implementazione dei getter;

<19/05/2021> Mancano solo i commenti

<25/05/2021> Ho inserito la connessione con il JDBC, che per il momento mi restituisce errori (Credo siano dovuti al jar);

<26/05/2021> Il Problema era realmente legato ai jar mancanti, li ho scaricati e inseriti nelle librerie della WAB-APP, adesso effettua il collegamento ma non esegue le query.

<27/05/2021> Adesso esegue le query, nella servlet non ho più problemi, ma nella jsp ho problemi legati al ResultSet;
             Dopo moltp, troppo, tempo ho risolto il problema legato al resultset, chiudevo la connessione prima di passare i dari;
             Adesso la web-app, che non ha uno scopo preciso, è funzionante;
             
