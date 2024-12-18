public class Hewan {
    String nama;
    int jumlahKaki;
    String makanan;
    String tipeHewan;

    public Hewan(String nama, int jumlahKaki, String makanan, String tipeHewan) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.makanan = makanan;
        this.tipeHewan = tipeHewan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jumlahKaki);
        System.out.println("Makanan : " + this.makanan);
        System.out.println("Type Hewan : " + this.tipeHewan);
        System.out.println();
    }

    public static void main(String[] args) {
        Hewan harimau = new Hewan("Harimau", 4, "Daging", "Karnivora");
        Hewan kerbau = new Hewan("Kerbau", 4, "Rumput", "Herbivora");

        harimau.tampilkanInfo();
        kerbau.tampilkanInfo();
    }
}