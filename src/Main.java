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


        Host h1 = new Host("","Gino Pasticcino","via Zattera 1", "ghasdp@gmail.it", "254521");
        Host h2 = new Host("","Luca Laurenti","via Marci 12", "gpas@gmail.it", "cvb236");
        Host h3 = new Host("","Marco Trotti","via Dei Martiri 13", "ginop@gmail.it", "er9889");
        Host h4 = new Host("","Frank Matano","via Nio 133", "gpiaon@gmail.it", "260794");
        Host h5 = new Host("","Gennaro Aragna","via Casisa 31", "gpb@gmail.it", "569vff");
        Host h6 = new Host("","Gino Aragona","via Don Gnocchi 14", "gfgp@gmail.it", "6544tt4");
        Host h7 = new Host("","Gino Pasticcino","via Musi 51", "gp@gmail.it", "887459234");
        Host h8 = new Host("","Gino Pasticcino","via Rucola 1", "gp@gmail.it", "45832à35");
        Host h9 = new Host("","Gino Pasticcino","via Zantella 15", "gp@gmail.it", "234klc");
        Host h10 = new Host("","Gino Pasticcino","via Reveri 17", "gp@gmail.it", "09fghzdr");
        Host h11 = new Host("","Gino Pasticcino","via Alba 91", "gp@gmail.it", "0985srs");
        Host h12 = new Host("","Gino Pasticcino","via Bis 10", "gp@gmail.it", "234dgh5dt");

        //aggiunta al database
        airBNB.dbHost.put(h1.getIdHost(), h1);
        airBNB.dbHost.put(h2.getIdHost(), h2);
        airBNB.dbHost.put(h3.getIdHost(), h3);
        airBNB.dbHost.put(h4.getIdHost(), h4);
        airBNB.dbHost.put(h5.getIdHost(), h5);
        airBNB.dbHost.put(h6.getIdHost(), h6);
        airBNB.dbHost.put(h7.getIdHost(), h7);
        airBNB.dbHost.put(h8.getIdHost(), h8);
        airBNB.dbHost.put(h9.getIdHost(), h9);
        airBNB.dbHost.put(h10.getIdHost(), h10);
        airBNB.dbHost.put(h11.getIdHost(), h11);
        airBNB.dbHost.put(h12.getIdHost(), h12);

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

        //System.out.println(airBNB.Top10Host()); not work!

        System.out.println(airBNB.AllSuperHost());

        System.out.println(airBNB.Top5Utenti());

        System.out.println(airBNB.MediaPostiLetto());
    }

}
