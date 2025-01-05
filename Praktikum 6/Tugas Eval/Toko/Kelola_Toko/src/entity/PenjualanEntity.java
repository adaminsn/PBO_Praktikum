package entity;

import java.util.Date;

public class PenjualanEntity {
    private int idPenjualan;
    private int idBarang;
    private int quantitas;
    private Date tanggal;
    private double totalHarga;

    public PenjualanEntity(int idPenjualan, int idBarang, int quantitas, Date tanggal, double totalHarga) {
        this.idPenjualan = idPenjualan;
        this.idBarang = idBarang;
        this.quantitas = quantitas;
        this.tanggal = tanggal;
        this.totalHarga = totalHarga;
    }

    public int getIdPenjualan() {
        return idPenjualan;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public int getQuantitas() {
        return quantitas;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public double getTotalHarga() {
        return totalHarga;
    }
}