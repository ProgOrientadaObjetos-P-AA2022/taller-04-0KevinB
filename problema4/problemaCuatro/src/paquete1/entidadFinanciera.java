/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class entidadFinanciera {

    private String nombre;
    private String nombreBanco;
    private double valor;
    private double valorComision;

    public entidadFinanciera() {
        nombre = "Carlos Vera";
        nombreBanco = "Banco Pichincha";
        valor = 10000;
    }

    public entidadFinanciera(String x, String y, double z) {
        nombre = x;
        nombreBanco = y;
        valor = z;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerBanco(String c) {
        nombreBanco = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public void calcularComision() {
        valorComision = (valor * 0.003) / 100;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return nombreBanco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double Comision() {
        return valorComision;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sNombre del cliente: %s\nNombre del banco: %s\n"
                + "Valor del cheque: %.2f\nValor de comision: %.2f",
                cadena, nombre, nombreBanco, valor, valorComision);
        return cadena;
    }
}
