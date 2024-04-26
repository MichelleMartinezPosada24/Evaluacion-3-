/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_exception;

import java.util.Scanner;

/**
 *
 * @author miche
 */
public class EVA3_6_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner captu = new Scanner (System.in);
        System.out.println("Intruce el numerador: ");
        int nume = captu.nextInt();
        System.out.println("Introduce el divisor: ");
        int divi = captu.nextInt();
        int resu = 0;
        resu = nume / divi;
        System.out.println("resultado = " + resu);
        } catch (Exception e){
            if( e intanceof InputMismatchException)
            System.out.println("inputmismatchexception");
            
             e.printStackTrace();
        }
    }
}
    

    

