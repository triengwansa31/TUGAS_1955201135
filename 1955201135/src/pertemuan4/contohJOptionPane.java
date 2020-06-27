/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.awt.Component;
import javax.swing.JOptionPane;



/**
 *
 * @author Toshiba
 */
public class contohJOptionPane {
    public static void main(String[] args) {
        
        String tanya = JOptionPane.showInputDialog("Dimana Anda Berada?");
        System.out.println("Anda Berada Di " + tanya);
        
        String keadaan = JOptionPane.showInputDialog("Bagaimana Keadaan Anda Saat Ini?");
        System.out.println("Keadaan Anda Sekarang " + keadaan);
        
        String kesehatan = JOptionPane.showInputDialog("Bagaimana Dengan Kesehatan Anda Selama Pendemi Ini ?");
        System.out.println("Keadaan Anda Selama Pendemi " + kesehatan);
        
        String keluarga = JOptionPane.showInputDialog("Bagaimana Keadaan Keluarga Anda ?");
        System.out.println("Keadaan Keluaga Anda " + keluarga);
       
        String sosial = JOptionPane.showInputDialog("Bagaimana Keadaan Masyarakat Disekitar Anda ?");
        System.out.println("Keadaan Masyarakat Disekitar Anda " + sosial);

        
    }
    
}
