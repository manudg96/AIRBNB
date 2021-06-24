public class Feedback {
    String IDFeedback;
    String titolo, testo;
    int punteggio;

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
        this.titolo = titolo;
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
        //if (punteggio <= 1 && punteggio => 5){
            this.punteggio = punteggio;
       // }
    }
}
