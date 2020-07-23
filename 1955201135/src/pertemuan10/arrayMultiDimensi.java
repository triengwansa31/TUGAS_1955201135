/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class arrayMultiDimensi {
    public static void main(String[] args) {
        
        System.out.println("array Satu Dimensi");
        int bilangan[] = {0,1,2,3,4,5,6,7,8,9};
        
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan[i]);
        }
        
        System.out.println("Array Multi Dimensi untuk Integer");
        int matriks[][] = {{1,4},{5,7}};
        
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        
        System.out.println("Array Multi Dimensi untuk String");
        String mahasiswa[][] = {{"01","Tri"},{"02","Eng"},{"03","Wansa"}};
        
        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[0].length; j++){
                System.out.print(mahasiswa[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        String cari =JOptionPane.showInputDialog(null, "Cari mahasiswa berdasarkan NIM");
        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[0].length; j++){
                if ( mahasiswa[i][j].equals(cari)){
                    JOptionPane.showConfirmDialog(null, "mahasiswa dengan NIM " + cari +" ditemukan bernama " + mahasiswa[i][j+1]);
                } 
                
                System.out.print(mahasiswa[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
