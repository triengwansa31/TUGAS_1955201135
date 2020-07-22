/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author Toshiba
 */
public class contohMath {
    public static void main(String[] args) {

        // Contoh Math Absolut
        int a = -10;
        int b = 5;
        int c = -10*5;
        System.out.println("untuk absolut");
        System.out.println(Math.abs(c));
        
        int d = 100;
        System.out.println("untuk akar");
        System.out.println(Math.sqrt(d));
        
        int e = 10;
        int f = 2;
        System.out.println("untuk pangkat");
        System.out.println(Math.pow(e, f));
        
        System.out.println("untuk maksimum");
        System.out.println(Math.max(e, f));
        
        double g = 20;
        System.out.println("untuk desimal");
        System.out.println(Math.round(g));
        
        
        double h = 30;
        System.out.println("umtuk sin " + Math.sin(h));
        
        System.out.println("untuk cos " + Math.cos(h));
    }
    
}
