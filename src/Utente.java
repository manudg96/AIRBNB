import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Utente {


    String IDutente;
    String nome;
    String indirizzo;
    String email;
    Deque<Prenotazione> prenotazioni = new ArrayDeque<>();


    public Utente(String IDutente, String nome, String indirizzo, String email) {
        this.IDutente = IDutente;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.email = email;
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


    public void getLast (Utente )



}
