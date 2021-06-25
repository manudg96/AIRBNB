import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AirBNB {

    LocalDate dataOggi = LocalDate.now();
    LocalDate mesePre = dataOggi.minusMonths(1);


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
    public Set<Host> updateSuperHost () {
        for (Host h : dbHost.values()) {
            if (h.numPrenotazioni>=99) { //perchè va da 0 a 99
                superHost.add(h);
            }
        }
        return superHost;
    }

    //ottenere le abitazioni corrispondente ad un certo codice host
    ArrayList<Abitazione> SearchAbitazione (String idHost){
        if (dbHost.containsKey(idHost)){
            return dbHost.get(idHost).getAbitazioni();//aggiungere il toString nel main
        }else {

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
        List<Abitazione> newDbAbitazione = new ArrayList<>();

        for (Prenotazione p : dbPrenotazioni.values()) {
            if (p.getStartDate().isAfter(mesePre) && p.getStartDate().isBefore(dataOggi)){
                newDbAbitazione.add(p.getAbitazione());
            }
        }
        newDbAbitazione.sort(Comparator.comparing(Abitazione::getContPrenotazioni).reversed());
        return newDbAbitazione.toString(); // ? da testare
    }//end TopAbitazione


    //ottenere gli host con più prenotazioni nell'ultimo mese
    List<HostRank> Top10Host (){
        Map<String, HostRank> PrenotazionxHost = new HashMap<>();
            for (Prenotazione prenotazione : dbPrenotazioni.values()) { //prendo l abitazione
                        if (prenotazione.getStartDate().isAfter(mesePre) && prenotazione.getStartDate().isBefore(dataOggi)) {
                                if (!PrenotazionxHost.containsKey(prenotazione.getAbitazione().getIdHost())) {
                                    PrenotazionxHost.put(prenotazione.getAbitazione().getIdHost(), new HostRank(prenotazione.getAbitazione().getIdHost(), 1));
                                }else {
                                    HostRank i = PrenotazionxHost.get(prenotazione.getAbitazione().getIdHost());
                                    i.setNPrenotazioni(i.getNPrenotazioni() + 1);
                                    PrenotazionxHost.put(prenotazione.getAbitazione().getIdHost(), i);
                            }
                        }
            }
        List<HostRank> ordinamentoHost = new ArrayList<>(PrenotazionxHost.values());
            ordinamentoHost.sort(Comparator.comparingInt(HostRank :: getNPrenotazioni).reversed());
        return ordinamentoHost.subList(0,10);
    }// end Top10Host

    //ottenere tutti i super-host
    Set<Host> AllSuperHost (){
        return superHost;
    }

    //ottenere i 5 utenti con più giorni prenotati nell'ultimo mese
    List<HostRank> Top5Utenti (){
        Map<String, HostRank> top = new HashMap<>();
        for (Utente u: dbUtenti.values()) {
            // u.ContaGiorniNelMese(mesePre, dataOggi);
            top.put(u.getIDutente(), new HostRank(u.getIDutente(),(int) u.ContaGiorniNelMese(mesePre, dataOggi)));
        }
        List<HostRank> ordinamentoHost = new ArrayList<>(top.values());
        ordinamentoHost.sort(Comparator.comparingInt(HostRank :: getNPrenotazioni).reversed());
        return ordinamentoHost.subList(0,5);
    }

    //ottenere il numero medio di posti letto calcolato in base a tutte le abitazioni caricate dagli host
    int MediaPostiLetto (){
        int pLetto = 0;
        for (Abitazione ab:dbAbitazione) {
            pLetto += ab.getNumeroPostiLetto();
        }
        return pLetto / dbAbitazione.size();
    }

}
//classe di appoggio interna per i top 10 host
class HostRank {
    String idHost;
    int NPrenotazioni;

    public HostRank(String idHost, int NPrenotazioni) {
        this.idHost = idHost;
        this.NPrenotazioni = NPrenotazioni;
    }

    public String getIdHost() {
        return idHost;
    }

    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    public int getNPrenotazioni() {
        return NPrenotazioni;
    }

    public void setNPrenotazioni(int NPrenotazioni) {
        this.NPrenotazioni = NPrenotazioni;
    }
}
