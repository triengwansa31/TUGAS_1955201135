/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class ProgramNama {
    public static void main(String[] args) {
        
         String namaMhs[] = new String[5];
        for (int i=0; i<namaMhs.length; i++){
           namaMhs[i] = JOptionPane.showInputDialog(null, "Inputkan Nama Mahasiswa ke " +i);
            System.out.println(namaMhs[i]);
        }
        
        String cariNama = JOptionPane.showInputDialog(null, "Cari Nama Mahasiswa");
        
        for(int i=0; i<namaMhs.length; i++){
            if (namaMhs[i].equals(cariNama)){
                 JOptionPane.showMessageDialog(null, "Nama yang anda cari adalah " + cariNama + " ketemu pada indexs ke " +i);
        }
     
        }
    }
}
