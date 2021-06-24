import java.util.*;

public class Utente {


    String IDutente;
    String nome;
    String indirizzo;
    String email;


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

    Deque<Prenotazione> prenotazioni = new Deque<Prenotazione>() {
        @Override
        public void addFirst(Prenotazione prenotazione) {

        }

        @Override
        public void addLast(Prenotazione prenotazione) {

        }

        @Override
        public boolean offerFirst(Prenotazione prenotazione) {
            return false;
        }

        @Override
        public boolean offerLast(Prenotazione prenotazione) {
            return false;
        }

        @Override
        public Prenotazione removeFirst() {
            return null;
        }

        @Override
        public Prenotazione removeLast() {
            return null;
        }

        @Override
        public Prenotazione pollFirst() {
            return null;
        }

        @Override
        public Prenotazione pollLast() {
            return null;
        }

        @Override
        public Prenotazione getFirst() {
            return null;
        }

        @Override
        public Prenotazione getLast() {
            return null;
        }

        @Override
        public Prenotazione peekFirst() {
            return null;
        }

        @Override
        public Prenotazione peekLast() {
            return null;
        }

        @Override
        public boolean removeFirstOccurrence(Object o) {
            return false;
        }

        @Override
        public boolean removeLastOccurrence(Object o) {
            return false;
        }

        @Override
        public boolean add(Prenotazione prenotazione) {
            return false;
        }

        @Override
        public boolean offer(Prenotazione prenotazione) {
            return false;
        }

        @Override
        public Prenotazione remove() {
            return null;
        }

        @Override
        public Prenotazione poll() {
            return null;
        }

        @Override
        public Prenotazione element() {
            return null;
        }

        @Override
        public Prenotazione peek() {
            return null;
        }

        @Override
        public boolean addAll(Collection<? extends Prenotazione> c) {
            return false;
        }

        @Override
        public void push(Prenotazione prenotazione) {

        }

        @Override
        public Prenotazione pop() {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public Iterator<Prenotazione> iterator() {
            return null;
        }

        @Override
        public Iterator<Prenotazione> descendingIterator() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };


}
