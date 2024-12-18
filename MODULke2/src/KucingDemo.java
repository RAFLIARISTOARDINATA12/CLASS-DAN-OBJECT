public class KucingDemo {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing(3, "Hitam");
        Kucing kucing2 = new Kucing(2, "Putih");

       kucing1.meong();
        kucing1.umur();
        kucing1.info();

        kucing2.meong();
        kucing2.umur();
        kucing2.info();
    }
}
