/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

import java.util.Scanner;

/**
 *
 * @author Farras Alam Majid
 */
public class Konversi {
    static double suhuAwal;
    static int pilihan;
    
    public static void main (String[] args) {
        Suhu suhuAir = new Suhu();
        boolean condition = false;
        double Celcius,Fahrenheit,Reamur,Kelvin;
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("|        PROGRAM KONVERSI SUHU        |");
        System.out.println("---------------------------------------");
        System.out.println("\nSilahkan Inputkan Suhu");
        System.out.print("Masukkan Suhu Dalam Celcius = ");
        suhuAwal=input.nextDouble();
        
        while (condition!=true){
            System.out.println("-----------------------------------");
            System.out.println("\n\nSilahkan pilih salah satu sub menu");
            System.out.println("---------");
            System.out.println("1. Tampilkan Data Konversi");
            System.out.println("2. Edit Input Suhu Awal");
            System.out.println("3. Exit");
            System.out.println("Pilih = ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                case 1 :
                if(suhuAwal<=0) {
                    Celcius = suhuAir.Celcius();
                    Fahrenheit = suhuAir.rumusFahrenheit();
                    Reamur = suhuAir.rumusReamur();
                    Kelvin = suhuAir.rumusKelvin();    
                    System.out.println("Suhu Dalam Celcius\t: "+Celcius+"Â°C");
                    System.out.println("Celcius ke Farenheit\t: "+Fahrenheit+"Â°F");
                    System.out.println("Celcius ke Reamur\t: "+Reamur+"Â°R");
                    System.out.println("Celcius ke Kelvin\t: "+Kelvin+"Â°K");
                    System.out.println("Kondisi Air Beku");
                    System.out.println("Press Enter To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    }
                else if (suhuAwal<100){
                    Celcius = suhuAir.Celcius();
                    Fahrenheit = suhuAir.rumusFahrenheit();
                    Reamur = suhuAir.rumusReamur();
                    Kelvin = suhuAir.rumusKelvin();                    
                    System.out.println("Suhu Dalam Celcius\t: "+Celcius+"Â°C");
                    System.out.println("Celcius ke Farenheit\t: "+Fahrenheit+"Â°F");
                    System.out.println("Celcius ke Reamur\t: "+Reamur+"Â°R");
                    System.out.println("Celcius ke Kelvin\t: "+Kelvin+"Â°K");
                    System.out.println("Perhitungan Ini Berdasarkan Kondisi Air Normal");
                    System.out.println("Press Enter To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    }
                else if (suhuAwal>=100){
                    Celcius = suhuAir.Celcius();
                    Fahrenheit = suhuAir.rumusFahrenheit();
                    Reamur = suhuAir.rumusReamur();
                    Kelvin = suhuAir.rumusKelvin();             
                    System.out.println("Suhu Dalam Celcius\t: "+Celcius+"Â°C");
                    System.out.println("Celcius ke Farenheit\t: "+Fahrenheit+"Â°F");
                    System.out.println("Celcius ke Reamur\t: "+Reamur+"Â°R");
                    System.out.println("Celcius ke Kelvin\t: "+Kelvin+"Â°K");
                    System.out.println("Perhitungan Ini Berdasarkan Kondisi Air Mendidih"); 
                    System.out.println("Press Enter To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    }

                break;
                case 2 :
                    System.out.println("\nInput Data");
                    System.out.println("----------");
                    System.out.print("Masukkan suhu celcius = ");
                    suhuAwal= input.nextDouble();
                    System.out.println("\n\nInput berhasil...");
                    System.out.println("Press Enter To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 3 :
                    condition = true ;
                    System.out.println("Terima Kasih!");
                    break;
                default :
                    System.out.println("Pilihan yang anda pilih tidak ada, silahkan ulangi!");
                    System.out.println("Press Enter To Continue...");
                    new java.util.Scanner(System.in).nextLine();
            }
        }
        
    }
    
}
