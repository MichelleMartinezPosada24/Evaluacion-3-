/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Introduce un numero entero: ");
            int num = sc.nextInt();
            System.out.println("El valor capturado fue: " + num );
        } catch (InputMismatchException e){
            System.out.println("El valor capturado no es un valor entero");
        }finally{
            //USAR PARA EJECUTAR CODIGO CRITICO PARA EL PROGRAMA 
            //TERMINAR PROCESOS, CERRAR ARCHIVOS O CONEXXIONES
            //LIBERAR RECURSOS ETC...
            //NADA EVITA QUE SE PUEDA PRODUCCIR UNA EXCEPCION EN ESTE BLOQUE DE CODIGO 
            /*int x = 100, y = 0;
            int divi = x / y; */
            System.out.println("Esta itruccion simepre se va a ejacutar");
            
                
               
            
        }
    }
    
}
