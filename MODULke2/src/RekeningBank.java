public class RekeningBank {
    private double saldo;
    private String noRekening;
    private String nama;

    public RekeningBank(String noRekening, String nama, double saldoAwal) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.saldo = saldoAwal;
    }

    public void cekSaldo() {
        System.out.println("Saldo saat ini: " + this.saldo);
    }

    public void menabung(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Berhasil menabung sebesar: " + jumlah);
        } else {
            System.out.println("Jumlah tabungan harus lebih dari 0");
        }
    }

    public void menarik(double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            System.out.println("Berhasil menarik sebesar: " + jumlah);
        } else {
            System.out.println("Jumlah penarikan tidak valid atau saldo tidak cukup");
        }
    }

    public void transfer(RekeningBank tujuan, double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Berhasil mentransfer sebesar: " + jumlah + " ke rekening " + tujuan.noRekening);
        } else {
            System.out.println("Jumlah transfer tidak valid atau saldo tidak cukup");
        }
    }
}