import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

class Dataklynge {

    private ArrayList<Rack> rackliste = new ArrayList<>();
    public int rackStorrelse = 12;

// konstruktør for klassen Dataklynge
    public Dataklynge(String filnavn) {
        lesFil(filnavn);
    }

  // Legger til Rack i en rackliste og returnerer lista.
    public ArrayList<Rack> addRack(Rack rack) {
        rackliste.add(rack);
        return rackliste;
    }
// Henter det totale antallet prosessorer i regneklyngen
    public int antProsessorer() {
        int teller = 0;
        for (Rack rack : rackliste) {
            if (rack != null) {
                teller += rack.hentProsessorer();
            }
        }
        return teller;
    }

// returnerer antall noder med nok minne i regneklyngen
    public int noderMedNokMinne(int paakrevdMinne) {
        int teller = 0;
        for (Rack rack : rackliste) {
            if (rack != null) {
                teller += rack.noderMedNokMinne(paakrevdMinne);
            }
        }
        return teller;
    }

// Henter antall racks
    public int antRacks() {
        return rackliste.size();
    }

// legger til noder i racks
    public int nyNode(int prosessorer, int minne) {
        for (Rack rack : rackliste) {
            if (rack.erArrayFullt() == false) {
                rack.settInn(new Node(prosessorer, minne));
                return 0;

            }
        }

        Rack nyttRack = new Rack();
        nyttRack.settInn(new Node(prosessorer, minne));
        rackliste.add(nyttRack);
        return 0;
     }

// Leser fra fil med denne metoden, brukte lignende i første plenumstime
    private void lesFil(String filnavn) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(filnavn));
        }

        catch (FileNotFoundException e) {
            System.out.println("Finner ikke filen");
        }

        while (sc.hasNextInt()) {
            int antallNoder = sc.nextInt();
            int prosessorer = sc.nextInt();
            int minne = sc.nextInt();

            antallNoder = nyNode(prosessorer, minne);

        }

        sc.close();
    }


}
