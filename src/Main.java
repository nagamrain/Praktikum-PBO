
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bambam
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args)  {
        
        Scanner input = new Scanner(System.in);
        int sisi = 0, panjang = 0, lebar = 0, tinggi = 0;
        
        
        try{
            System.out.print (" Masukkan Sisi Kubus : ");
            sisi = input.nextInt();
            
            System.out.print(" Masukkan Panjang Balok : ");
            panjang = input.nextInt();
            
            System.out.print(" Masukkan Lebar Balok : ");
            lebar = input.nextInt();
            
            System.out.print(" Masukkan Tinggi Balok : ");
            tinggi = input.nextInt();
        } catch(InputMismatchException error){
            System.out.println(" Erornya adalah " + error.getMessage());
        } finally {
            Kubus kubus = new Kubus(sisi);
            Balok balok = new Balok(panjang,lebar,tinggi);
        
            kubus.tampilkan();
            balok.tampilkan();    
        }
        
        
    }
  
}
