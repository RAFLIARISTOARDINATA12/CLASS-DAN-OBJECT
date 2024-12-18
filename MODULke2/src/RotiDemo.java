public class RotiDemo {
    public static void main(String[] args) {
        Roti roti1 = new Roti();
        roti1.beriWarna("Hijau");
        roti1.beriRasa("Pandan");
        roti1.timbangBerat(30);
        roti1.hargaJual(6000);
        roti1.infoRoti();
        
        Roti roti2 = new Roti();
        roti2.beriWarna("Merah");
        roti2.beriRasa("Cokelat");
        roti2.timbangBerat(40);
        roti2.hargaJual(8000);
        roti2.infoRoti();

        Roti roti3 = new Roti();
        roti3.beriWarna("Kuning");
        roti3.beriRasa("Keju");
        roti3.timbangBerat(50);
        roti3.hargaJual(10000);
        roti3.infoRoti();
    }
}
  