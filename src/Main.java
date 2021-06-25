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

        //aggiunta al database
        airBNB.dbUtenti.put(utente1.getIDutente(), utente1);
        airBNB.dbUtenti.put(utente2.getIDutente(), utente2);
        airBNB.dbUtenti.put(utente3.getIDutente(), utente3);
        airBNB.dbUtenti.put(utente4.getIDutente(), utente4);


        Abitazione abitazione1 = new Abitazione("LAKSJDB96","Reggia di Caserta", "via Napoli 91", 281,64,12000);
        Abitazione abitazione2 = new Abitazione("ALJDDJ98","Baracca senza tetto","via Sotto il Ponte",1,3,0);
        Abitazione abitazione3 = new Abitazione("LSKDJNDDDO7", "Casa al mare","via Moro 70", 2,6,120);
        Abitazione abitazione4 = new Abitazione("SKNON87", "Trullo", "via Alberobello 54", 1,4,84);
        Abitazione abitazione5 = new Abitazione("LAKSJDN89", "Baita","via Cucuzzolo della Montagna",4,16,52);


        //aggiunta al database
        airBNB.dbAbitazione.add(abitazione1);
        airBNB.dbAbitazione.add(abitazione2);
        airBNB.dbAbitazione.add(abitazione3);
        airBNB.dbAbitazione.add(abitazione4);
        airBNB.dbAbitazione.add(abitazione5);


        Host h1 = new Host("","Gino Pasticcino","via Zattera 1", "gp@gmail.it", "254521");

        //aggiunta al database
        airBNB.dbHost.put("254521", h1);

        Prenotazione p1 = new Prenotazione("ajhs5",LocalDate.parse("2021-06-05"),LocalDate.parse("2021-06-14"),utente1,abitazione1);
        Prenotazione p2 = new Prenotazione("djfjl",LocalDate.parse("2021-08-03"),LocalDate.parse("2021-08-12"),utente2,abitazione5);
        Prenotazione p3 = new Prenotazione("djdn",LocalDate.parse("2021-07-26"),LocalDate.parse("2021-08-05"),utente3,abitazione3);
        Prenotazione p4 = new Prenotazione("sjnrin", LocalDate.parse("2021-06-29"),LocalDate.parse("2021-07-13"), utente4,abitazione2);
        Prenotazione p5 = new Prenotazione("akskdo", LocalDate.parse("2021-06-14"), LocalDate.parse("2021-06-24"),utente3,abitazione4);

        //aggiunta al database
        airBNB.dbPrenotazioni.put("ajhs5", p1);
        airBNB.dbPrenotazioni.put("djfjl", p2);
        airBNB.dbPrenotazioni.put("djdn", p3);
        airBNB.dbPrenotazioni.put("sjnrin", p4);
        airBNB.dbPrenotazioni.put("akskdo", p5);

        System.out.println(airBNB.updateSuperHost()); //ovviamente è null perche non esistono super host

        h1.AggiungiAbitazione(abitazione1);

        System.out.println(airBNB.SearchAbitazione("254521").toString());

        utente1.addPrenotazione(p1);

        System.out.println(airBNB.UltimaPrenotazione("KG521MN"));

        System.out.println(airBNB.TopAbitazione());
    }

}
