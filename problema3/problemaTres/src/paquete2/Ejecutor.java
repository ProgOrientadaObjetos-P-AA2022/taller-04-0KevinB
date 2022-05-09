/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import paquete1.automotor;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        String cedula = "1104486228";
        String marca = "Ford";
        int año = 2015;
        double valor = 25000;
        automotor a1 = new automotor();
        a1.calcularValorMatricula();
        automotor a2 = new automotor(cedula, marca, año, valor);
        a2.calcularValorMatricula();
        System.out.println(a1);
        System.out.println("-----------------");
        System.out.println(a2);
    }
}
