package project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GudangManager gudang = new GudangManager();

        int pilihan;
        do {
            System.out.println("\n===== MENU APLIKASI GUDANG =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Ubah Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    gudang.tambahBarang();
                    break;
                case 2:
                    gudang.tampilkanBarang();
                    break;
                case 3:
                    gudang.ubahBarang();
                    break;
                case 4:
                    gudang.hapusBarang();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
