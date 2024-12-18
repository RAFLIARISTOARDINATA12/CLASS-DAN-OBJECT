public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;

    public Karyawan(String nama, String alamat, String jabatan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }

        public void tampilkanAlamat() {
        System.out.println("Alamat: " + alamat);
    }
        
    public void tampilkanJabatan() {
        System.out.println("Jabatan: " + jabatan);
    }

    public void tampilkanGaji() {
        System.out.println("Gaji: " + gaji);
    }

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Rafli Aristo Ardinata", "Jl. Sakjose No. 1", "Manager Utama", 7500000.00);

        karyawan1.tampilkanNama();
        karyawan1.tampilkanAlamat();
        karyawan1.tampilkanJabatan();
        karyawan1.tampilkanGaji();
    }
}
