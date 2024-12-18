public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;
    
    public Mahasiswa(String nama, String nim, String alamat, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.semester = semester;
    }

    public void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }

    public void tampilkanNim() {
        System.out.println("NIM: " + nim);
    }

    public void tampilkanAlamat() {
        System.out.println("Alamat: " + alamat);
    }

    public void tampilkanSemester() {
        System.out.println("Semester: " + semester);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Rafli Aristo Ardinata", "20030040", "Jl. Oke Sip No. 1", 3);
        
        mahasiswa1.tampilkanNama();
        mahasiswa1.tampilkanNim();
        mahasiswa1.tampilkanAlamat();
        mahasiswa1.tampilkanSemester();
    }
}