/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author salce
 */
public class Dron implements Transporte {
    @Override
    public double calcularCosto(double distancia, String tipoServicio) {
        double costoBase = tipoServicio.equals("Estándar") ? 30 : 50;
        return costoBase + 20; 
    }

    @Override
    public double calcularTiempoEntrega(double distancia) {
        return distancia / 60; 
    }
}