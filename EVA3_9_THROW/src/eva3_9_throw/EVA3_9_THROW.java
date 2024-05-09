/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_throw;

/**
 *
 * @author Michelle
 */
public class EVA3_9_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            metodoProblematico();
        }catch(Exception ex){
            ex.printStackTrace(); 
        }
        
    }
    public static void metodoProblematico() throws Exception{
        System.out.println("Holi");
        System.out.println("OlA K AsE");
        throw new Exception("System Failure !!");
        
    }
    
}
