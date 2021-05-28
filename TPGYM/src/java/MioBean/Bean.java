package MioBean;
import java.io.Serializable; /* importo il metodo ser per il bean */

public class Bean implements Serializable {
    /* Variabili private, non accessibili se non con i metodi set e get */
    private String name;
    private String cognome;
    private String mail;
    
    /* Creo i metodi setter e getter per le variabili */
    public void setNome(String n){
        this.name = n;
    }
    public String getNome(){
        return this.name;
    }
    public void setCognome(String n){
        this.cognome = n;
    }
    public String getCognome(){
        return this.cognome;
    }
    public void setMail(String n){
        this.mail = n;
    }
    public String getMail(){
        return this.mail;
    }
    
}
