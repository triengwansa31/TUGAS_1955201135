/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author Toshiba
 */
public class PerhitunganMatriks {
    public static void main(String[] args) {
        
         int matriksA[][] = {{7,9,5},{1,5,0},{4,1,2}};
        int matriksB[][] = {{5,7,3},{0,4,6},{3,4,5}};
        
        System.out.println("Matrik A");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksB.length; j++){
                System.out.print(matriksA[i][j] +" ");
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Matrik B");
        for (int k = 0; k < matriksA.length; k++){
            for (int l = 0; l < matriksB.length; l++){
                System.out.print(matriksB[k][l] +" ");
            }
            System.out.println();
        }
        
        // menambahkan deklarasi matrik C yang nilainya adalah hasil perhitungan Matrik A dan B
        int matriksC[][] = new int[matriksA.length][matriksB[0].length];
        System.out.println();
        System.out.println("Hasil Pengurangan"); //Bagian pengurangan antara matrik a dan B
        System.out.println();
        for (int m = 0; m < matriksC[0].length; m++){
            for (int n = 0; n < matriksC.length; n++){
                matriksC[m][n] = matriksA[m][n] - matriksB[m][n];
                System.out.print(matriksC[m][n]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Hasil Pemjumlahan"); //Bagian penjumlahan antara matrik a dan B
        System.out.println();
        for (int m = 0; m < matriksC[0].length; m++){
            for (int n = 0; n < matriksC.length; n++){
                matriksC[m][n] = matriksA[m][n] + matriksB[m][n];
                System.out.print(matriksC[m][n]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Hasil Perkalian"); //Bagian perkalian antara matrik A dan B
        System.out.println();
        for (int m = 0; m < matriksC[0].length; m++){
            for (int n = 0; n < matriksC.length; n++){
                matriksC[m][n] = matriksA[m][n] * matriksB[m][n];
                System.out.print(matriksC[m][n]+"\t");
            }
            System.out.println();
        }
    }
}
