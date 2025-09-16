/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPerbankandenganAbstraksi;

import java.util.Scanner;

abstract class Rekening {
    private String nomorRekening;
    protected double saldo;

    public Rekening(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public abstract void tarik(double jumlah);
}

class RekeningTabungan extends Rekening {
    public RekeningTabungan(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && saldo - jumlah >= 50) { // Saldo minimal 50
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }
}

class RekeningGiro extends Rekening {
    public RekeningGiro(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Jumlah penarikan tidak valid.");
        }
    }
}

class RekeningDeposito extends Rekening {
    public RekeningDeposito(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }

    @Override
    public void tarik(double jumlah) {
        System.out.println("Tidak bisa melakukan penarikan. Rekening deposito memiliki aturan khusus.");
    }
}

public class SistemPerbankan {
    public static void main(String[] args) {
        Rekening tabungan = new RekeningTabungan("123456", 1000);
        Rekening giro = new RekeningGiro("789012", 5000);
        Rekening deposito = new RekeningDeposito("345678", 20000);

        tabungan.setor(200);
        tabungan.tarik(1000);
        
        System.out.println("--------------------");

        giro.setor(100);
        giro.tarik(500);

        System.out.println("--------------------");

        deposito.setor(500);
        deposito.tarik(1000);
    }
}
