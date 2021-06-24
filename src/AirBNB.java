import java.util.HashSet;
import java.util.Set;

public class AirBNB {

    public AirBNB() {
        this.dbUtenti = new HashSet<>();
        this.dbAbitazione = new HashSet<>();
        this.dbPrenotazioni = new HashSet<>();
        this.dbHost = new HashSet<>();
        this.superHost = new HashSet<>();
    }

    Set<Utente> dbUtenti;
    Set<Abitazione> dbAbitazione;
    Set<Prenotazione> dbPrenotazioni;
    Set<Host> dbHost;
    Set<Host> superHost;


    public void updateSuperHost () {
        if (dbHost) {

        }
    }

    void SearchAbitazione (){

    }

    void UltimaPrenotazione (){

    }

    void TopAbitazione (){

    }

    void Top10Host (){

    }

    void AllSuperHost (){

    }

    void Top5Utenti (){

    }

    void MediaPostiLetto (){

    }

}
