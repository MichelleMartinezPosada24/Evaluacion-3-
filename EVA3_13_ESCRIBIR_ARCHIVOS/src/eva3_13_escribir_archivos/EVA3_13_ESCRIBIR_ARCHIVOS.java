/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Michelle
 */
public class EVA3_13_ESCRIBIR_ARCHIVOS {
 final static String miRuta = "C:\\archivos\\archive_texto"; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            escribirFiles(miRuta + "files.txt", "Hola mundo !! \n" + "Prueba con la clase files");
            escribirFileWriter(miRuta + "fileWriter.txt", "Segundo metodo para agregar archivos");
            escribirBufferedWriter(miRuta + "BufferedWriter.txt", "Tercer metodo para escritura \n");
            
        }catch (IOException ex){
            ex.printStackTrace();
        }
        
    }
    public static void escribirFiles(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta);
        //Path path = paths.get(ruta);
        Files.write(path, datos.getBytes());
    }
    public static void escribirFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    public static void escribirBufferedWriter(String ruta, String datos) throws IOException{
       
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(datos);
        bw.close();
    }
}
