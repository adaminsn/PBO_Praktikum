package entity;

public class BarangEntity {
    private int idBarang;
    private String nama;
    private double harga;
    private int stock;

    public BarangEntity(int idBarang, String nama, double harga, int stock) {
        this.idBarang = idBarang;
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}