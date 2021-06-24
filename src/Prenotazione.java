import java.time.LocalDate;
import java.util.Objects;

public class Prenotazione
{
    String idPrenotazione;
    LocalDate startDate, endDate;
    Utente utente;
    Abitazione abitazione;

    public Prenotazione(String idPrenotazione, LocalDate startDate, LocalDate endDate, Utente utente, Abitazione abitazione)
    {
        this.idPrenotazione = idPrenotazione;
        this.startDate = startDate;
        this.endDate = endDate;
        this.utente = utente;
        this.abitazione = abitazione;
    }

    public String getIdPrenotazione() {
        return idPrenotazione;
    }

    public void setIdPrenotazione(String idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Abitazione getAbitazione() {
        return abitazione;
    }

    public void setAbitazione(Abitazione abitazione) {
        this.abitazione = abitazione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prenotazione)) return false;
        Prenotazione that = (Prenotazione) o;
        return Objects.equals(getIdPrenotazione(), that.getIdPrenotazione()) && Objects.equals(getStartDate(), that.getStartDate()) && Objects.equals(getEndDate(), that.getEndDate()) && Objects.equals(getUtente(), that.getUtente()) && Objects.equals(getAbitazione(), that.getAbitazione());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPrenotazione(), getStartDate(), getEndDate(), getUtente(), getAbitazione());
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "idPrenotazione='" + idPrenotazione + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", utente=" + utente +
                ", abitazione=" + abitazione +
                '}';
    }
}
