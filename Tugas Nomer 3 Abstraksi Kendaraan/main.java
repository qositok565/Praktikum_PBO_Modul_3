/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraksiKendaraan;

import java.util.Scanner;

abstract class Kendaraan {
    public abstract void nyalakanMesin();
    public void matikanMesin() {
        System.out.println("Mesin kendaraan dimatikan.");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan.");
    }
}

class Motor extends Kendaraan {
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin motor dinyalakan.");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();

        Kendaraan kendaraan;

        if (pilihan == 1) {
            kendaraan = new Mobil();
        } else if (pilihan == 2) {
            kendaraan = new Motor();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        kendaraan.nyalakanMesin();
        kendaraan.matikanMesin();

        scanner.close();
    }
}