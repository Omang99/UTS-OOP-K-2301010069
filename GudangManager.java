package project;

import java.util.Scanner;

public class GudangManager {
    Barang[] daftarBarang = new Barang[100];
    int jumlahBarang = 0;
    Scanner scanner = new Scanner(System.in);

    public void tambahBarang() {
        if (jumlahBarang < daftarBarang.length) {
            System.out.print("Masukkan kode barang: ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan nama barang: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();
            System.out.print("Masukkan harga barang: ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); // buang newline

            daftarBarang[jumlahBarang] = new Barang(kode, nama, jumlah, harga);
            jumlahBarang++;
            System.out.println("Barang berhasil ditambahkan!");
        } else {
            System.out.println("Gudang penuh!");
        }
    }

    public void tampilkanBarang() {
        if (jumlahBarang == 0) {
            System.out.println("Belum ada barang.");
        } else {
            System.out.println("\n=== Daftar Barang ===");
            for (int i = 0; i < jumlahBarang; i++) {
                System.out.println("No. " + (i + 1));
                daftarBarang[i].tampilkan();
            }
        }
    }

    public void ubahBarang() {
        tampilkanBarang();
        System.out.print("Masukkan nomor barang yang ingin diubah: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < jumlahBarang) {
            System.out.print("Masukkan nama baru: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan jumlah baru: ");
            int jumlah = scanner.nextInt();
            System.out.print("Masukkan harga baru: ");
            double harga = scanner.nextDouble();
            scanner.nextLine();

            daftarBarang[index].nama = nama;
            daftarBarang[index].jumlah = jumlah;
            daftarBarang[index].harga = harga;

            System.out.println("Barang berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public void hapusBarang() {
        tampilkanBarang();
        System.out.print("Masukkan nomor barang yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < jumlahBarang) {
            for (int i = index; i < jumlahBarang - 1; i++) {
                daftarBarang[i] = daftarBarang[i + 1];
            }
            daftarBarang[jumlahBarang - 1] = null;
            jumlahBarang--;
            System.out.println("Barang berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
