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
public class TugasArrayMultiDimensiBentukString {
    
    public static void main(String[] args) {
        String model[][] = {{"01","Hardcore"},{"02","Rapi"},{"03","Mandarin"},{"04","Mohawk"}};
        for (int i = 0; i < model.length; i++){
            for (int j = 0; j < model[0].length; j++){
                System.out.print(model[i][j]+" ");
            }
            System.out.println();
        }
        
        String cari = JOptionPane.showInputDialog(null, "Cari Model Rambut Berdasarkan Nomor Pilihan :");
        for (int i = 0; i < model.length; i++){
            for (int j = 0; j < model[0].length; j++){
                if (model[i][j].equals(cari)) {
                    JOptionPane.showConfirmDialog(null, "Model Rambut Dengan Pilihan Nomor " + cari + " Adalah Model " + model[i][j+1]);
                }
                System.out.print(model[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
