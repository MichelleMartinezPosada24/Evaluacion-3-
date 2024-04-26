/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Michelle
 */
public class EVA3_7_USO_EXCEPCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingresa un numero entero: ");
                numero = scanner.nextInt();
                entradaValida = true; 
            } catch (InputMismatchException e) {
                System.out.println(" INGRESAR SUMERO ENTERO. ");
                scanner.nextLine(); 
            }
        }

        System.out.println("El numero ingresado es: " + numero);
    }
}
    
    

