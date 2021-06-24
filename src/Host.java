import java.awt.*;
import java.util.ArrayList;

public class Host extends  Utente{

    String idHost;
    int numPrenotazioni;
    ArrayList<Abitazione> abitazioni;

    public String getIdHost() {
        return idHost;
    }

    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    public int getNumPrenotazioni() {
        return numPrenotazioni;
    }

    public void setNumPrenotazioni(int numPrenotazioni) {
        this.numPrenotazioni = numPrenotazioni;
    }

    public ArrayList<Abitazione> getAbitazioni() {
        return abitazioni;
    }

    public void setAbitazioni(ArrayList<Abitazione> abitazioni) {
        this.abitazioni = abitazioni;
    }

    public Host(String IDutente, String nome, String indirizzo, String email, String idHost) {
        super(IDutente, nome, indirizzo, email);
        this.idHost = idHost;
        this.abitazioni = new ArrayList<>();
    }

}
