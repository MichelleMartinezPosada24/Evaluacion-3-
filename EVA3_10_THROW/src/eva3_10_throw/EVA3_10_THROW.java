/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_throw;

/**
 *
 * @author Michelle
 */
public class EVA3_10_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       try{
        Persona human = new Persona("Juan" , " Perez " , 0);
       
       } catch (Exception ex){
                ex.printStackTrace();
               
       }
       try{
        System.out.println("Fin del programa");         
       
        Persona human = new Persona();
        human.setNombre("Juan");
        human.setApellido("Juan");
        human.setEdad(0);
       }catch(Exception ex){
           System.out.println("Se cierra el programa");
       }
    }
    
}
