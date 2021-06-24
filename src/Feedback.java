import java.util.Scanner;

public class Feedback {
    String IDFeedback;
    String titolo, testo;
    int punteggio;

    Scanner m = new Scanner(System.in);

    public Feedback(String IDFeedback, String titolo, String testo, int punteggio) {
        this.IDFeedback = IDFeedback;
        this.titolo = titolo;
        this.testo = testo;
        this.punteggio = punteggio;
    }

    public String getIDFeedback() {
        return IDFeedback;
    }

    public void setIDFeedback(String IDFeedback) {
        this.IDFeedback = IDFeedback;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if (titolo.length() <= 50 ) {
            this.titolo = titolo;
        }else {
            System.out.println("hai inserito un titolo troppo grande, inserisci massimo 50 caratteri. \n" +
                    "ne hai inseriti: " + titolo.length());
            titolo = m.nextLine();
            setTitolo(titolo);
        }
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        //controllo punteggio
        if ((punteggio >= 1) && (punteggio <= 5)){
            this.punteggio = punteggio;
        }else{
            System.out.println("Inserisci un punteggio compreso tra 1 e 5");
            punteggio = m.nextInt();
            setPunteggio(punteggio);
        }
    }
}
