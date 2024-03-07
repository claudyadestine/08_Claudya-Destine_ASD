public class TransaksiBarang {

        public Barang[] barangs;
    
        public TransaksiBarang(Barang[] barangs) {
            this.barangs = barangs;
        }
        public void lakukanPembelian(String kodeBarang, int jumlah) {
            // Implementasi sesuai kebutuhan
            // ...
        }
    
        public void tampilkanBarangPembelian() {
            // Implementasi sesuai kebutuhan
            // ...
        }
        public void tampilkanBarang() {
            System.out.println("=====================");
            System.out.println("   Daftar Barang:");
            System.out.println("=====================");
            System.out.printf("%-10s %-20s %-10s %-10s%n", "Kode", "Nama", "Harga", "Stok");
            for (Barang barang : barangs) {
                System.out.printf("%-10s %-20s %-10.2f %-10d%n",
                        barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
    }
}
}