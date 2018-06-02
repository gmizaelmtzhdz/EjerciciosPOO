/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author G. Mizael Mtz Hdz
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String color;
    private String tamano;
    
    
    public Perro()
    {   
        
    }
    /**
     * @param String nombre
     * @param String raza
     */
    public Perro(String nombre, String raza)
    {   
        this.nombre=nombre;
        this.raza=raza;
    }
    /**
     * @param String nombre
     * @param String raza
     * @param String color
     * @param String tamano
     * @param int edad
     */
    public Perro(String nombre, String raza, String color, String tamano, int edad)
    {   
        this.nombre=nombre;
        this.raza=raza;
        this.color=color;
        this.tamano=tamano;
        this.edad=edad;
    }
    /**
     * @param String nombre
     * @param int edad
     */
    public Perro(String nombre, int edad)
    {   
        this.nombre=nombre;
        this.edad=edad;
    }
    public String ladrar()
    {
        return "El perro está ladrando";
    }
    public String correr()
    {
        return "El perro está corriendo";
    }
    public String saltar()
    {
        return "El perro está saltando";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tamano
     */
    public String getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }   
}