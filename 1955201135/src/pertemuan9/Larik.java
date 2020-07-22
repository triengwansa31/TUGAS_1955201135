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
public class Larik {
    
    public static void main(String[] args) {
        
        // contoh deklarasi array cara ke-1
        int angka[] = new int[4];
        angka[0] = 100;
        angka[1] = 120;
        angka[2] = 140;
        angka[3] = 160;
        
        
        // contoh deklarasi array cara ke-2
        String namaTeman[] = {"Liyo", "Layo", "Loyo", "Luyo"};
        
        // cara print array
        for (int i=0; i<angka.length; i++){
        System.out.println(angka[i]);
        }
        
        for (int i=0; i<namaTeman.length; i++){
        System.out.println(namaTeman[i]);
        }
    }
}
