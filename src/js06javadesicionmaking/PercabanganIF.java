/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package js06javadesicionmaking;
import java.util.Scanner;

/**
 *
 * @author 21343018_Anita Nursi
 */
public class PercabanganIF {
    public static void main(String[] args) {
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukkan total pembelian: Rp");
        total_pembelian = dataMasuk.nextDouble();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        
        System.out.println("Besarnya diskon: Rp" + diskon);
    }
}
