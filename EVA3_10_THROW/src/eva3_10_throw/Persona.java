package eva3_10_throw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michelle
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "no name";
        this.apellido = "no last name";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
         if((edad < 0) || (edad > 150))
            throw new Exception ("Este programa se cerrara,  ya que se introdujo un valor no válido");
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if((edad < 0) || (edad > 150))
            throw new Exception ("Este programa se cerrara,  ya que se introdujo un valor no válido");
        this.edad = edad;
    }
    
    
}
