import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Host host = (Host) o;
        return numPrenotazioni == host.numPrenotazioni && Objects.equals(idHost, host.idHost) && Objects.equals(abitazioni, host.abitazioni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idHost, numPrenotazioni, abitazioni);
    }

    @Override
    public String toString() {
        return "Host{" +
                "idHost='" + idHost + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
