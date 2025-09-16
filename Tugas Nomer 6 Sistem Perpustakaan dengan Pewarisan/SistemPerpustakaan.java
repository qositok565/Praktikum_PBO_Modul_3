/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPerpustakaandenganPewarisan;

import java.util.Scanner;

class ItemPerpustakaan {
    protected String judul;
    protected int tahunTerbit;

    public ItemPerpustakaan(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Tahun: " + tahunTerbit);
    }
}

class Buku extends ItemPerpustakaan {
    private String pengarang;
    private int jumlahHalaman;

    public Buku(String judul, int tahun, String pengarang, int jumlahHalaman) {
        super(judul, tahun);
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Pengarang: " + pengarang + ", Halaman: " + jumlahHalaman);
    }
}

class Majalah extends ItemPerpustakaan {
    private int edisi;
    private int volume;

    public Majalah(String judul, int tahun, int edisi, int volume) {
        super(judul, tahun);
        this.edisi = edisi;
        this.volume = volume;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Edisi: " + edisi + ", Volume: " + volume);
    }
}

class DVD extends ItemPerpustakaan {
    private int durasi;
    private String genre;

    public DVD(String judul, int tahun, int durasi, String genre) {
        super(judul, tahun);
        this.durasi = durasi;
        this.genre = genre;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Durasi: " + durasi + " menit, Genre: " + genre);
    }
}

public class SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pilih jenis item: ");
        System.out.println("1. Buku");
        System.out.println("2. Majalah");
        System.out.println("3. DVD");
        System.out.print("Pilih opsi: ");
        int opsi = scan.nextInt();
        scan.nextLine(); // flush buffer

        ItemPerpustakaan item = null;
        if (opsi == 1) {
            System.out.print("Judul: ");
            String judul = scan.nextLine();
            System.out.print("Tahun: ");
            int tahun = scan.nextInt();
            scan.nextLine();
            System.out.print("Pengarang: ");
            String pengarang = scan.nextLine();
            System.out.print("Jumlah Halaman: ");
            int halaman = scan.nextInt();
            item = new Buku(judul, tahun, pengarang, halaman);
        } else if (opsi == 2) {
            System.out.print("Judul: ");
            String judul = scan.nextLine();
            System.out.print("Tahun: ");
            int tahun = scan.nextInt();
            System.out.print("Edisi: ");
            int edisi = scan.nextInt();
            System.out.print("Volume: ");
            int volume = scan.nextInt();
            item = new Majalah(judul, tahun, edisi, volume);
        } else if (opsi == 3) {
            System.out.print("Judul: ");
            String judul = scan.nextLine();
            System.out.print("Tahun: ");
            int tahun = scan.nextInt();
            System.out.print("Durasi (menit): ");
            int durasi = scan.nextInt();
            scan.nextLine();
            System.out.print("Genre: ");
            String genre = scan.nextLine();
            item = new DVD(judul, tahun, durasi, genre);
        } else {
            System.out.println("Pilihan tidak valid!");
            System.exit(0);
        }

        System.out.println("\n=== Informasi Item ===");
        item.tampilkanInfo();
    }
}
