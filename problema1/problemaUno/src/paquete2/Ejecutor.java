/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import paquete1.estudiante;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombre = "Samuel de Luque";
        double materia1 = 7.77;
        double materia2 = 9.22;
        double materia3 = 9.17;
        estudiante est = new estudiante();
        est.calcularPromedio();
        estudiante est2 = new estudiante(nombre, materia1, materia2, materia3);
        est2.calcularPromedio();
        System.out.printf("%s\n", est);
        System.out.println("-------------");
        System.out.printf("%s\n", est2);
    }
}
