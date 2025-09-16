/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAlatElektronik;

import java.util.Scanner;

interface AlatElektronik {
    void hidupkan();
    void matikan();
}

class Televisi implements AlatElektronik {
    @Override
    public void hidupkan() {
        System.out.println("Televisi dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("Televisi dimatikan.");
    }
}

class Radio implements AlatElektronik {
    @Override
    public void hidupkan() {
        System.out.println("Radio dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("Radio dimatikan.");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih alat elektronik:");
        System.out.println("1. Televisi");
        System.out.println("2. Radio");
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();
        
        AlatElektronik alat;
        
        if (pilihan == 1) {
            alat = new Televisi();
        } else if (pilihan == 2) {
            alat = new Radio();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        System.out.println("\nPilih aksi:");
        System.out.println("1. Hidupkan");
        System.out.println("2. Matikan");
        System.out.print("Masukkan pilihan aksi Anda (1 atau 2): ");
        int aksi = scanner.nextInt();
        
        if (aksi == 1) {
            alat.hidupkan();
        } else if (aksi == 2) {
            alat.matikan();
        } else {
            System.out.println("Aksi tidak valid.");
        }
        
        scanner.close();
    }
}
