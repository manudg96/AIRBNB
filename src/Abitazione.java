import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class Abitazione {

    public Abitazione() {
    }

    String idAbitazione, nome, indirizzo;
    int numeroLocali, numeroPostiLetto;
    double prezzo;
    List<Feedback> feedBack;
    LocalDate dateFrom, dateTo;
    Period period;

    public Abitazione(String idAbitazione, String nome, String indirizzo, int numeroLocali, int numeroPostiLetto, double prezzo) {
        this.idAbitazione = idAbitazione;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroLocali = numeroLocali;
        this.numeroPostiLetto = numeroPostiLetto;
        this.prezzo = prezzo;
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
    */

}
