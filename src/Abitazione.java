import java.time.Period;
import java.util.List;

public class Abitazione {

    String idAbitazione, nome, indirizzo;
    int numeroLocali, numeroPostiLetto;
    double prezzo;
    List<Feedback> feedBack;
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

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

}
