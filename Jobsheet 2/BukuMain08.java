public class BukuMain08 {
    public static void main(String[] args) {

    Buku08 bk1 = new Buku08();
    bk1.judul = "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1. gantiHarga(60000);
    bk1.tampilInformasi(); 
    System.out.println("Harga total : "+ bk1.hitungHargaTotal(5));
    System.out.println("Harga Diskon : " + bk1.hitungDiskon(bk1.hitungHargaTotal(5)));

    System.out.println();
    
    Buku08 bk2 = new Buku08("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilInformasi();

    System.out.println();

    Buku08 bukuClaudya = new Buku08("Pergi Ke Bulan", "Claudya Destine", 200, 5, 85000);
    bukuClaudya.terjual(3);
    bukuClaudya.tampilInformasi();
    System.out.println("Harga total buku terjual :" + bukuClaudya.hitungHargaTotal(3));

    }
}