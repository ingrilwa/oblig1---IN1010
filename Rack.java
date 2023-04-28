
class Rack {
    private Node [] nodeArray;
    private int antallNoder;
    private boolean maks;
    public int rackStorrelse = 12;

// konstruktør for klassen Rack
    public Rack() {
        nodeArray = new Node[rackStorrelse];
    }

// setter inn noder i nodeArray
    public void settInn(Node node) {
        if (!maks) {
            nodeArray[antallNoder] = node;
            antallNoder ++;
        }
        if (antallNoder == rackStorrelse) {
            maks = true;
        }
    }
    
// returnerer ut nodeArrayet
    public Node[] hentNodeListe() {
        return nodeArray;
    }

// sjekker hvor mange noder som har nok minne
    public int noderMedNokMinne(int paakrevdMinne) {
        int totalt = 0;
        for (int i = 0; i < nodeArray.length; i++) {
            if ((nodeArray[i] != null) && (nodeArray[i].minne() >= paakrevdMinne)) {
                totalt ++;
            }
        }
        return totalt;
    }

// returnerer ut antall prosessorer i racket
    public int hentProsessorer() {
        int totalt = 0;
        for (int i = 0; i < nodeArray.length; i++) {
            if (nodeArray[i] != null) {
                totalt += nodeArray[i].prosessorer();
            }
        }
        return totalt;
    }

// sjekker om arrayet er fullt eller ikke
    public boolean erArrayFullt() {
        if (nodeArray[nodeArray.length-1] != null) {
            return true;
        }
        return false;
    }

}
