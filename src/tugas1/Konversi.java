/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;


public class Konversi {
    double celcius;
    double r, f, k;
    
    Konversi(double celcius){
        r= (4 * celcius)/5;
        f= ((9 * celcius)/5) +32;
        k= celcius + 273.15;
    }
 
    public static void kondisi(double celcius) {
        if(celcius < 0){
            System.out.print("Kondisi Air Beku\n\n");
        }else if(celcius > 0 && celcius < 100){
            System.out.print("Kondisi Air Normal\n\n");
        }else{
            System.out.print("Kondisi Air Mendidih\n\n");
        }
    }
}
