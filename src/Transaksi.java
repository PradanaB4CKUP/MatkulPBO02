public class Transaksi {
    //atribut
    private Item item;
    private int jumlah;

    //constructor
    public Transaksi(Item item, int jumlah){
        this.item = item;
        this.jumlah = jumlah;

    }

    //method untuk menghitung total harga transaksi
    public double getTotalHarga(){
        return item.getHarga() * jumlah;
    }

    //method untuk mencetak detail transaksi
    public void printDetailTransaksi(){
        System.out.println("Nama Item : " + item.getNama());
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total Harga : " + getTotalHarga());
    }
}
