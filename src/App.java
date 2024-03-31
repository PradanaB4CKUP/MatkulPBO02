public class App {
    public static void main(String[] args) throws Exception {
        // membuat objek item
        Item item1 = new Item("Buku", 50);
        Item item2 = new Item("Pensil", 10);

        // melakukan transaksi
        Kasir.prosesTransaksi(item1, 2);
        Kasir.prosesTransaksi(item2, 5);
    }
}
