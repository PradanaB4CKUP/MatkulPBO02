public class Item {
    //atribut
    private String nama;
    private double harga;

    //constructor
    public Item(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    //getter
    public String getNama(){
        return nama;
    }

    //getter untuk harga item
    public double getHarga(){
        return harga;
    }
}
