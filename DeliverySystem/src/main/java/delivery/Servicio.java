/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivery;

import transporte.Transporte;
import transporte.TransporteFactory;

/**
 *
 * @author salce
 */
public class Servicio {
    private String tipoServicio;
    private String tipoPaquete;
    private double distancia;

    public Servicio(String tipoServicio, String tipoPaquete, double distancia) {
        this.tipoServicio = tipoServicio;
        this.tipoPaquete = tipoPaquete;
        this.distancia = distancia;
    }

    public double[] calcularCostoTiempo(String tipoTransporte) {
        Transporte transporte = TransporteFactory.obtenerTransporte(tipoTransporte);
        double costo = transporte.calcularCosto(distancia, tipoServicio);
        double tiempo = transporte.calcularTiempoEntrega(distancia);
        return new double[] {costo, tiempo};
    }
}