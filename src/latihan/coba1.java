/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author fauzi
 */
public class coba1 {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        
        //Menginput jumlah elemen array
        
        System.out.print("Masukkan Jumlah Angka : ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        
        //memasukkan array
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan Angka ke " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }
        
        
        System.out.println("========================");
        
        //mengurutkan secara ASCENDING
        Arrays.sort(arr);
        
        //menampilkan array ASCENDING
        System.out.print("ASCENDING : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("");
        
        //mengurutkan secara DESCENDING
        int[] desc = new int[n];
        for (int i = 0; i < n; i++){
            desc[i] = arr[n-i-1];
        }
        
        //menampilkan array DESCENDING
        System.out.print("DESCENDING : ");
        for(int i = 0; i < n; i++){
            System.out.print(desc[i] + " ");
        }
        
        System.out.println("");
        
        //mencari nilai min dan max
        int min = arr[0];
        int max = arr[n-1];
        
        System.out.print("Nilai Min : " +min);
        System.out.println("");
        System.out.print("Nilai Max : " +max);
        
        System.out.println("");
        
        double avg = Arrays.stream(arr).average().orElse(Double.NaN);
        
        System.out.print("Nilai Rata - Rata : " +avg);
        
        System.out.println("");
    }
}


