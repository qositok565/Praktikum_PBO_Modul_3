/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PengembanganPolimorfisme;

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

class Burung extends Hewan {
    @Override
    public void suara() {
        System.out.println("Burung berkicau.");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Hewan[] hewanArray = new Hewan[4];
        hewanArray[0] = new Anjing();
        hewanArray[1] = new Kucing();
        hewanArray[2] = new Kucing();
        hewanArray[3] = new Burung();
        
        System.out.println("Pilih hewan dari 0 hingga 3: ");
        
        int pilihan = scanner.nextInt();

        if (pilihan >= 0 && pilihan < hewanArray.length) {
            hewanArray[pilihan].suara(); 
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
}
