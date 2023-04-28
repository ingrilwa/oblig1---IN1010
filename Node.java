
class Node {
    private int prosessorer;
    private int minne;

// konstruktør for klassen Node
    public Node(int prosessorer, int minne) {
        this.prosessorer = prosessorer;
        this.minne = minne;
    }

// returnerer antall prosessorer
    public int prosessorer() {
        return prosessorer;
    }

// returnerer minne
    public int minne() {
        return minne;
    }
}
