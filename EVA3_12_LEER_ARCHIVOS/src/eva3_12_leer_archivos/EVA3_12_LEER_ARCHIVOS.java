/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class EVA3_12_LEER_ARCHIVOS {
     final static String miRuta = "C:\\archivos\\archive_texto";
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
        // TODO code application logic heres
       leerArchivoFiles(miRuta);
       leerArchivoBuffered(miRuta);
       leerArchivoFilReader(miRuta);
       leerArchivoScanner(miRuta);
       
    } catch (IOException ex) {
    ex.printStackTrace();
}
    }
    public static void leerArchivoFiles (String ruta) throws IOException{
        
        System.out.println("Lectura de archivo de texto con clase Files ");
        Path path = Paths.get(ruta);
        
        byte[] datos = Files.readAllBytes(path);//Genera una IOException 
        
        // new String --> convierte el arreglo cadena de texto 
        System.out.println(new String (datos));
        
    }
   
    /* Es adecuado para leer archivos grandes
    nos permite procesar archivos de texto linea por linea 
    */
        public static void leerArchivoBuffered(String ruta) throws IOException{
       
            System.out.println("Lectura de archivo de texto con clase Buffered ");
            //ABRRIR EL ARCHIVO 
            //LEER EL ARCHIVO COMO INFORMACION BINARIA 
            //CONVERTIR LA INFORMACION BINARIA A TEXTO 
            
            File file = new File(ruta);
            FileInputStream in = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader); 
            String cade;
            //ASIGNAMOS LA LINEA ALA VARIABLE CADE
            // SI CADE ES DIFERENTE DE NULL, ESTAMOS LEYENDO TEXTO, SI LEEMOS NULL LLEGAMOS AL FINAL DEL ARCHIVO 
            
           while((cade = br.readLine())!= null){
               System.out.println(cade);  
           } 
           br.close();
        }      
         public static void leerArchivoFilReader (String ruta) throws FileNotFoundException, IOException{
             File file = new File(ruta);
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader); 
            String cade;
            //ASIGNAMOS LA LINEA ALA VARIABLE CADE
            // SI CADE ES DIFERENTE DE NULL, ESTAMOS LEYENDO TEXTO, SI LEEMOS NULL LLEGAMOS AL FINAL DEL ARCHIVO 
            // LEYENDO TEXTO,
           while((cade = br.readLine())!= null){
               System.out.println(cade);  
           }
         }
           
           public static void leerArchivoScanner(String ruta) throws IOException{
               System.out.println("Lectura de archivo de texto con la calse Scanner ");
               Path path = Paths.get(ruta);
                 Scanner leer = new Scanner(path);
                 while(leer.hasNextLine()){
                     String cade = leer.nextLine();
                     System.out.println(cade);
                 }
               leer.close();
                      
           }

        
                   
        }
    

