public class Kucing {
    int umur; 
    String warnaBulu;

    public Kucing(int umur, String warnaBulu) {
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }

    void meong() {
        System.out.println("Meong!");
    }

    void umur() {
        System.out.println("Umur kucing ini adalah " + umur + " tahun.");
    }

    void info() {
        System.out.println("Kucing ini berwarna " + warnaBulu + " dan berumur " + umur + " tahun.");
    }
}