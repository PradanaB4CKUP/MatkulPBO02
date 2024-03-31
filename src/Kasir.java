public class Kasir {
    //method untuk memproses transaksi
    public static void prosesTransaksi(Item item, int jumlah){
        Transaksi transaksi = new Transaksi(item, jumlah);
        transaksi.printDetailTransaksi();
    }
}
