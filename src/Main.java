import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        AirBNB airBNB = new AirBNB();

        Utente utente1= new Utente("KG521MN","Mario Draghi", "via Roma 104", "mariodraghi@draghi.it");
        Utente utente2= new Utente("SKS632D", "Ciccio Banana", "via Mosca 9", "cicciobanana3@mail.com");
        Utente utente3= new Utente("SLDJ632", "Dante Alighieri", "via Selva Oscura 54","dantealighieri@divinacommedia.it");
        Utente utente4= new Utente("NDDJFO95","Snoopy Dormiglione", "via Charlie Brown 37", "snoopy@gmail.com");

        Abitazione abitazione1 = new Abitazione("LAKSJDB96","Reggia di Caserta", "via Napoli 91", 281,64,12000);
        Abitazione abitazione2 = new Abitazione("ALJDDJ98","Baracca senza tetto","via Sotto il Ponte",1,3,0);
        Abitazione abitazione3 = new Abitazione("LSKDJNDDDO7", "Casa al mare","via Moro 70", 2,6,120);
        Abitazione abitazione4 = new Abitazione("SKNON87", "Trullo", "via Alberobello 54", 1,4,84);
        Abitazione abitazione5 = new Abitazione("LAKSJDN89", "Baita","via Cucuzzolo della Montagna",4,16,52);

        //Prenotazione p1 = new Prenotazione("ajhs5",2021-06-05,2021-06-14,utente1,abitazione1);

    }

}
