/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author Toshiba
 */
public class JarakEuclidean {
    
    public static void main(String[] args) {
        
        // Objek Math
        // Array
        
        // x = usia
        // y = berat badan
        // z = ipk
        double saya[] = {20, 57, 3.45};
        double anton[] = {21, 55, 3.40};
        double andi [] = {22, 60, 3.47};
        
        // perbandingan antara saya dengan anton
        double d_saya_anton = Math.sqrt((Math.pow(20-21, 2))+(Math.pow(57-55, 2))+ (Math.pow(3.45-3.40, 2)));
        System.out.println("Hasil jarak euclidean antara saya dengan anton adalah : " + d_saya_anton);
        
        // perbandingan saya dengan andi
        double d_saya_andi = Math.sqrt((Math.pow(20-22, 2))+(Math.pow(57-60, 2))+ (Math.pow(3.45-3.47, 2)));
        System.out.println("Hasil jarak euclidean antara saya dengan andi adalah : " + d_saya_andi);
        
        // hasil final antara saya-anton dan saya-andi
        double hasilFinal = Math.min(d_saya_anton, d_saya_andi);
        System.out.println("hasil final adalah : " + hasilFinal);
    }
}