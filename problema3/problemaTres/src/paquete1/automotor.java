/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class automotor {

    private String cedula;
    private String marca;
    private int año;
    private double valor;
    private double valorMatricula;

    public automotor() {
        cedula = "1105589426";
        marca = "Nissan";
        año = 2010;
        valor = 17000;
    }

    public automotor(String a, String b, int c, double d) {
        cedula = a;
        marca = b;
        año = c;
        valor = d;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAño(int c) {
        año = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valor * 0.002) / 100 * (2022 - año);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAño() {
        return año;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sCedula del cliente: %s\nMarca del vehiculo: %s\n"
                + "Año del vehiculo: %d\nValor del vehiculo: %.2f\nValor de la "
                + "matricula: %.2f",
                cadena, cedula, marca, año, valor, valorMatricula);
        return cadena;
    }
}
