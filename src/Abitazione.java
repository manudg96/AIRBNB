import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Abitazione {

    String idAbitazione, nome, indirizzo;
    int numeroLocali, numeroPostiLetto;
    double prezzo;
    List<Feedback> feedBack;
    LocalDate dateFrom, dateTo;
    Period period;
    int contPrenotazioni;
    String idHost;

    public Abitazione(String idAbitazione, String nome, String indirizzo, int numeroLocali, int numeroPostiLetto, double prezzo) {
        this.idAbitazione = idAbitazione;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroLocali = numeroLocali;
        this.numeroPostiLetto = numeroPostiLetto;
        this.prezzo = prezzo;
        this.contPrenotazioni = 0;
    }

    public String getIdHost() {
        return idHost;
    }

    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    public int getContPrenotazioni() {
        return contPrenotazioni;
    }

    public void setContPrenotazioni(int contPrenotazioni) {
        this.contPrenotazioni = contPrenotazioni;
    }

    public String getIdAbitazione() {
        return idAbitazione;
    }

    public void setIdAbitazione(String idAbitazione) {
        this.idAbitazione = idAbitazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getNumeroLocali() {
        return numeroLocali;
    }

    public void setNumeroLocali(int numeroLocali) {
        this.numeroLocali = numeroLocali;
    }

    public int getNumeroPostiLetto() {
        return numeroPostiLetto;
    }

    public void setNumeroPostiLetto(int numeroPostiLetto) {
        this.numeroPostiLetto = numeroPostiLetto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<Feedback> getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(List<Feedback> feedBack) {
        this.feedBack = feedBack;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public Period getPeriod() {
        return Period.between(dateFrom, dateTo);
    }

    /*

    public static void main(String[] args) {
        Abitazione ab = new Abitazione();
        ab.setDateFrom(LocalDate.parse("2021-06-25"));
        ab.setDateTo(LocalDate.parse("2021-06-28"));
        System.out.println(ab.getPeriod().get(ChronoUnit.DAYS));
    }


//    public Abitazione() {
//    }

    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abitazione that = (Abitazione) o;
        return numeroLocali == that.numeroLocali && numeroPostiLetto == that.numeroPostiLetto && Double.compare(that.prezzo, prezzo) == 0 && contPrenotazioni == that.contPrenotazioni && Objects.equals(idAbitazione, that.idAbitazione) && Objects.equals(nome, that.nome) && Objects.equals(indirizzo, that.indirizzo) && Objects.equals(feedBack, that.feedBack) && Objects.equals(dateFrom, that.dateFrom) && Objects.equals(dateTo, that.dateTo) && Objects.equals(period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAbitazione, nome, indirizzo, numeroLocali, numeroPostiLetto, prezzo, feedBack, dateFrom, dateTo, period, contPrenotazioni);
    }

    @Override
    public String toString() {
        return "Abitazione{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
