/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan3;

import java.util.Scanner;

// Kelas abstract Hewan
abstract class Hewan {
    public abstract void suara();
    public void tidur() {
        System.out.println("Hewan sedang tidur");
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
}

// Kelas turunan Kucing
class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing mengeong");
    }
}

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();

        Hewan hewan; // Referensi polimorfisme

        if (pilihan == 1) {
            hewan = new Anjing(); 
        } else if (pilihan == 2) {
            hewan = new Kucing(); 
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        hewan.suara();
        hewan.tidur();
        
        scanner.close();
    }
}
