
class Hovedprogram {

    public static void main(String[] args) {
        Dataklynge dataklynge = new Dataklynge("dataklynge2.txt");

        System.out.println("Noder med minst 128 GB: " + dataklynge.noderMedNokMinne(128));
        System.out.println("Noder med minst 512 GB: " + dataklynge.noderMedNokMinne(512));
        System.out.println("Noder med minst 1024 GB: " + dataklynge.noderMedNokMinne(1024));
        System.out.println("Totalt antall prosessorer i dataklyngen er " + dataklynge.antProsessorer());
        System.out.println("Antall racks er " + dataklynge.antRacks());
    }
}
