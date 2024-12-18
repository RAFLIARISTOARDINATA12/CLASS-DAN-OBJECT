public class RekeningBankDemo {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("123456789", "John Doe", 5000);
        RekeningBank rekening2 = new RekeningBank("987654321", "Jane Smith", 3000);

       rekening1.cekSaldo();
       rekening2.cekSaldo();

       rekening1.menabung(1000);

       rekening2.menarik(500);

       rekening1.transfer(rekening2, 2000);

       rekening1.cekSaldo();
       rekening2.cekSaldo();
       }
}