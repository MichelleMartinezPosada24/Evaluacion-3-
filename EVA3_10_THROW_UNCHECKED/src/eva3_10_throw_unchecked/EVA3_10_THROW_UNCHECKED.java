/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_throw_unchecked;

/**
 *
 * @author Michelle
 */
public class EVA3_10_THROW_UNCHECKED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Persona human = new Persona("Juan" , "Perez", -1);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
    
}
