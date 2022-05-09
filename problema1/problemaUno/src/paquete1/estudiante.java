/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class estudiante {

    private String estudiante;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public estudiante() {
        estudiante = "Luis Lopez";
        materia1 = 8.9;
        materia2 = 7.2;
        materia3 = 9.65;
    }

    public estudiante(String x, double a, double b, double c) {
        estudiante = x;
        materia1 = a;
        materia2 = b;
        materia3 = c;
    }

    public void establecerNombre(String c) {
        estudiante = c;
    }

    public void establecerMateria1(double c) {
        materia1 = c;
    }

    public void establecerMateria2(double c) {
        materia2 = c;
    }

    public void establecerMateria3(double c) {
        materia3 = c;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public String obternerNombre() {
        return estudiante;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%s%s\nNota 1 %.2f\nNota 2 %.2f\nNota 3 %.2f\n"
                + "Promedio: %.2f",
                cadena, estudiante, materia1, materia2, materia3, promedio);
        return cadena;
    }
}
