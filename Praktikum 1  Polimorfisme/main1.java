/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1;

import java.util.Scanner;

class Hewan {
    public void suara() {
        System.out.println("Hewan membuat suara");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing mengeong");
    }
}

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();

        Hewan hewan; // Referensi polimorfisme

        if (pilihan == 1) {
            hewan = new Anjing(); // Polimorfisme, objek Anjing
        } else if (pilihan == 2) {
            hewan = new Kucing(); // Polimorfisme, objek Kucing
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        hewan.suara(); // Memanggil metode suara secara polimorfisme
        
        scanner.close();
    }
}
