/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Toshiba
 */
public class TugasBufferReader {
    public static void main(String[] args) throws IOException {
        //TODO code application logic here
        String nama, pekerjaan, kuliah = "";
        int semester;
        double ipk;
        
        //objek input
        InputStreamReader isr = new InputStreamReader(System.in);
        
        //objek buffereader
         BufferedReader br = new BufferedReader(isr);
         
        //mengisi variabel buffereader
        System.out.println("Siapa Nama Anda ?");
        nama = br.readLine();
        
        System.out.println("Apa Pekerjaan Anda ?");
        pekerjaan = br.readLine();
        
        System.out.println("Anda Kuliah Dimana ?");
        kuliah = br.readLine();
        
        System.out.println("Anda Sekarang Semester Berapa ?");
        semester = Integer.parseInt(br.readLine());
        
        System.out.println("Berapa IPK Anda ?");
        ipk = Double.parseDouble(br.readLine());
        
        
        //menampilkan hasil buffereader
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Pekerjaan Anda Adalah " + pekerjaan);
        System.out.println(kuliah + " Adalah Tempat Kuliah Anda");
        System.out.println("Anda Sekarang Semester " + semester);
        System.out.println("IPK Anda Adalah " + ipk);
    }
    
}
