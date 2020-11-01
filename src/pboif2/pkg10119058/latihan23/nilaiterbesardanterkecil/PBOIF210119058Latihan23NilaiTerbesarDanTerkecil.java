/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan nilai
 *                     terbesar dan terkecil.
 * 
 */
public class PBOIF210119058Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nilai = new int[10];
        int n,max,min;
        String nama;
        
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas: ");
        nama = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        n = input.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.print("Nilai Mahasiswa Ke-"+i+" = ");
            nilai[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa====== ");
        for(int i=1; i<=n; i++){
            System.out.println("Hasil Mahasiswa Ke="+i+" = "+nilai[i]);
        }
        max=nilai[1];
        min=nilai[1];
        for (int i=1;i<=n; i++){
            if(nilai[i]>max){
                max=nilai[i];
            }
            if(nilai[i]<min){
                min=nilai[i];
            }
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min);
        System.out.println("");
        System.out.println("Petugas : "+nama);
    }
    
    
}
