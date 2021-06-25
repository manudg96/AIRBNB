import java.util.*;

public class AirBNB {

    public AirBNB() {
        //this.dbUtenti = new HashSet<>();
        this.dbUtenti = new HashMap<>();
        this.dbAbitazione = new HashSet<>();
        this.dbPrenotazioni = new HashMap<>();
        //this.dbHost = new HashSet<>();
        this.dbHost = new HashMap<>();
        this.superHost = new HashSet<>();
    }

    //Set<Utente> dbUtenti;
    Map<String, Utente> dbUtenti;
    Set<Abitazione> dbAbitazione;
    //Set<Prenotazione> dbPrenotazioni;
    Map<String, Prenotazione> dbPrenotazioni;
    Map<String, Host> dbHost;
    //Set<Host> dbHost;
    Set<Host> superHost;


    //aggiunge gli host ai super host
    public void updateSuperHost () {
        for (Host h : dbHost.values()) {
            if (h.numPrenotazioni>=99) { //perchè va da 0 a 99
                superHost.add(h);
            }
        }
    }

    //ottenere le abitazioni corrispondente ad un certo codice host
    ArrayList<Abitazione> SearchAbitazione (String idHost){
        if (dbHost.containsKey(idHost)){
            return dbHost.get(idHost).getAbitazioni();//aggiungere il toString nel main
        }
        return null;
    }

    //ottenere l'ultima prenotazione dato un id utente
    Prenotazione UltimaPrenotazione (String IDutente){
        if (dbUtenti.containsKey(IDutente)){
            return dbUtenti.get(IDutente).getLastPrenotazione();
        }
        return null;
    }

    //ottenere l'abitazione più gettonata nell'ultimo mese
    String TopAbitazione (){
        List<Abitazione> newDbAbitazione = new ArrayList<>(dbAbitazione);
        newDbAbitazione.sort(Comparator.comparing(Abitazione::getContPrenotazioni));
        return newDbAbitazione.toString(); // ? da testare
    }

    //ottenere gli host con più prenotazioni nell'ultimo mese
    void Top10Host (){

    }

    //ottenere tutti i super-host
    void AllSuperHost (){

    }

    //ottenere i 5 utenti con più giorni prenotati nell'ultimo mese
    void Top5Utenti (){

    }

    //ottenere il numero medio di posti letto calcolato in base a tutte le abitazioni caricate dagli host
    void MediaPostiLetto (){

    }

}
