package project;

public class Barang {
    String kode;
    String nama;
    int jumlah;
    double harga;

    public Barang(String kode, String nama, int jumlah, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void tampilkan() {
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga  : Rp" + harga);
        System.out.println("-------------------------");
    }
}
