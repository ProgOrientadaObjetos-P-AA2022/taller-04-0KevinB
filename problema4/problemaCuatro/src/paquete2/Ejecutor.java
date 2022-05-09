/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import paquete1.entidadFinanciera;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombre = "Carl Jhonson";
        String banco = "Banco de Guayaquil";
        double valor = 5000;
        entidadFinanciera b1 = new entidadFinanciera();
        b1.calcularComision();
        entidadFinanciera b2 = new entidadFinanciera(nombre, banco, valor);
        b2.calcularComision();
        System.out.println(b1);
        System.out.println("------------");
        System.out.println(b2);
    }
}
