/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import java.util.Scanner;

/**
 *
 * @author VANKA
 */
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pilih;
        double inputan;
   
        System.out.print("+---------------------------+\n");
        System.out.print("| PROGRAM KONVERSI SUHU AIR |\n");
        System.out.print("+---------------------------+\n");
        System.out.print("Input Data \n");
        System.out.print("----------\n");
        System.out.print("Suhu Dalam Celcius : ");
        inputan = scanner.nextDouble();
                
        while(true){
            Konversi Celci = new Konversi(inputan);
            System.out.print("Opsi\n");
            System.out.print("----\n");
            System.out.print("1. Lihat Data Konversi\n");
            System.out.print("2. Edit Data Konversi\n");
            System.out.print("3. Exit\n");
            System.out.print("Pilih : ");
            pilih = scanner.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Suhu Dalam Celcius\t : " + inputan + "°C");
                    System.out.println("Dalam Fahrenheit\t\t : " + Celci.f + "°F");
                    System.out.println("Dalam Reamur\t\t : " + Celci.r + "°R");
                    System.out.println("Dalam Kelvin\t\t : " + Celci.k + "K");
                    Konversi.kondisi(inputan);
                    break;
                
                case 2 :
                    System.out.print("Input Data\n");
                    System.out.print("----------\n");
                    System.out.print("Suhu Dalam Celcius\t : ");
                    inputan = scanner.nextDouble();
                    break;
                    
                case 3 :
                    System.exit(0);
                
                default :    
                    System.out.print("Opsi tidak ada. Mohon masukkan opsi dengan benar!\n\n");    
            }
        }
    }
}
