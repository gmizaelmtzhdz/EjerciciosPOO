/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion1;

/**
 *
 * @author G. Mizael Mtz Hdz
 */
public class Paciente
{
    //variables de instancia
    private String nombre;
    private String domicilio;
    private int edad;
    private float peso;
    private float estatura;
    private float imc;
    
    //constructor
    public Paciente(String nombre, float peso, float estatura)
    {
        this.nombre=nombre;
        this.peso=peso;
        this.estatura=estatura;
    }
    //metodo que calcula el valor del IMC
    public float imc(float p, float e)
    {
        return imc=p/(e*e);
    }
    public String mensaje(float i)
    {
        String msg=null;
        if(i<18.5)
        {
            msg="Paciente con peso bajo";
        }
        else if(i>=18.5 && imc <=24.9)
        {
            msg="Paciente con peso normal";
        }   
        return msg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
}
