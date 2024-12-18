public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tgllahir;

    public Dosen(String nama, int nik, String pendidikan, String tgllahir) {
        this.nama = nama;
        this.nik = nik;
        this.pendidikan = pendidikan;
        this.tgllahir = tgllahir;
    }

    public void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }

    public void tampilkanNik() {
        System.out.println("NIK: " + nik);
    }
    
    public void tampilkanPendidikan() {
        System.out.println("Pendidikan: " + pendidikan);
    }
    
    public void tampilkanTglLahir() {
        System.out.println("Tanggal Lahir: " + tgllahir);
    }

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Dr. Rafli Aristo Ardinata", 1122334455, "S3 Informatika", "01-01-2001");

        dosen1.tampilkanNama();
        dosen1.tampilkanNik();
        dosen1.tampilkanPendidikan();
        dosen1.tampilkanTglLahir();
    }
}