import java.util.Date;
import java.util.Objects;

public class Prenotazione
{
    String idPrenotazione;
    Date startDate, endDate;
    Utente utente;
    Abitazione abitazione;

    public Prenotazione(String idPrenotazione, Date startDate, Date endDate, Utente utente, Abitazione abitazione)
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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
}
