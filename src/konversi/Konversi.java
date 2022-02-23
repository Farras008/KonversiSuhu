/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

/**
 *
 * @author Farras Alam Majid
 */
public class Suhu {
    double Celcius(){
        return(Konversi.suhuAwal);
    }
    double rumusFahrenheit(){
        return((Konversi.suhuAwal*9)/5+32);
    }
    double rumusReamur(){
        return((Konversi.suhuAwal*4)/5);
    }
    double rumusKelvin(){
        return(Konversi.suhuAwal+273.15);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
