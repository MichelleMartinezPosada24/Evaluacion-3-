/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_unchecked_exceptions;

/**
 *
 * @author Michelle
 */
public class EVA3_2_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = null;
        System.out.println(perso.toString());
        
        int arreglo[] = new int[10];
        
        arreglo[15] = 100;
       
       int x = 10, y = 0;
       int resu = x / y;
        System.out.println(resu);
    }
    
    class Persona{
    
    }
    
    
}
