/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class tugasScanner {
    public static void main(String[] args) throws IOException {
        String nama;
        int umur;
        int TB;
        int BB = 0;
        double ratarata;
        
        Scanner inputUser = new Scanner(System.in);
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //input
        System.out.println("Siapa Nama Anda ?");
        nama = br.readLine();
        
        System.out.println("Berapa umur anda ?");
        umur = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("Berapa Tinggi Badan Anda ?");
        TB = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("Berapa Berat Badan Anda ?");
        BB = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("Berapa Rata-rata Nilai Raportmu ?");
        ratarata = Double.parseDouble(inputUser.nextLine());
            
        //output
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Umur Anda Adalah " + umur);
        System.out.println("Tinggi Badan Anda Adalah " + TB);
        System.out.println("Berat Badan Anda Adalah " + BB);
        System.out.println("Nilai Rata-rata Raport Anda Adalah " + ratarata);
    }
}
