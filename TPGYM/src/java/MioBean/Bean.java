package MioBean;
import java.io.Serializable;

public class Bean implements Serializable {
    private String name;
    private String cognome;
    private String mail;
    
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
