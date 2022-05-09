/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class profesores {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private double sueldoTotal;

    public profesores() {
        nombre = "Byron";
        apellido = "Castillo";
        sueldo = 450;
        cedula = "1104479526";
    }

    public profesores(String x, String y, String z, double a) {
        nombre = x;
        apellido = y;
        cedula = z;
        sueldo = a;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerSueldoBasico(double c) {
        sueldo = c;
    }

    public void establecerSueldoToral() {
        sueldoTotal = sueldo + (sueldo * 0.20);
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldo;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%s%s %s\nSueldo basico: %.2f\nSueldo total: "
                + "'%.2f",cadena, nombre, apellido, sueldo, sueldoTotal);
        return cadena;
    }
}
