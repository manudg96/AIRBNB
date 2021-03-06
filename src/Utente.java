import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Utente {

    String IDutente;
    String nome;
    String indirizzo;
    String email;
    Deque<Prenotazione> prenotazioni;

    public Utente(String IDutente, String nome, String indirizzo, String email)
    {
        this.prenotazioni = new ArrayDeque<>();
        this.IDutente = IDutente;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.email = email;
        this.prenotazioni=new ArrayDeque<>();
    }

    public long ContaGiorniNelMese(LocalDate mesePre, LocalDate dataOggi){
        long contDay = 0;
        for (Prenotazione p: prenotazioni) {
            if (p.getStartDate().isAfter(mesePre) && p.getStartDate().isBefore(dataOggi)) {
                Period GiorniSingolaP = Period.between(p.getStartDate(), p.getEndDate());
                contDay = GiorniSingolaP.get(ChronoUnit.DAYS) + contDay;
            }
        }
        return contDay;
    }

    public void addPrenotazione(Prenotazione prenota)
    {
        prenotazioni.add(prenota);
    }

    public Prenotazione getLastPrenotazione ()
    {
        return prenotazioni.peekLast();
    }

    public int getAllPrenotazioni()
    {
        return prenotazioni.size();
    }

    public String getIDutente() {
        return IDutente;
    }

    public void setIDutente(String IDutente) {
        this.IDutente = IDutente;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(IDutente, utente.IDutente) && Objects.equals(nome, utente.nome) && Objects.equals(indirizzo, utente.indirizzo) && Objects.equals(email, utente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDutente, nome, indirizzo, email);
    }

    @Override
    public String toString() {
        return "Utente{" +
                "IDutente='" + IDutente + '\'' +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
