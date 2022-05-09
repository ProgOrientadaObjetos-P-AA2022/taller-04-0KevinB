/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import paquete1.profesores;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombre = "Leopoldo";
        String apellido = "Jimenez";
        String cedula = "1109075693";
        double sueldo = 500.75;
        profesores profe = new profesores();
        profe.establecerSueldoToral();
        System.out.printf("%s\n", profe);
        profesores profe2 = new profesores(nombre, apellido, cedula, sueldo);
        profe2.establecerSueldoToral();
        System.out.printf("%s\n", profe2);
    }
}
