/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author root
 */
public class PruebaPacientes {
    public static void main(String[] args) {
        Paciente p1=new Paciente("Paciente A",1.75F, 62.0F);
        System.out.println(p1.mensaje(p1.imc(p1.getPeso(), p1.getEstatura())));
    }
}
