/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author salce
 */
public class Bicicleta implements Transporte{
    
    @Override
    public double calcularCosto(double distancia, String tipoServicio) {

        double costoBase = tipoServicio.equals("Estándar") ? 30 : 50;
        double costo = costoBase + 5; 

        if (distancia > 10) {
            costo += (distancia - 10) * 5;
        }
        return costo;
    }

    @Override
    public double calcularTiempoEntrega(double distancia) {
        return distancia / 20; 
    }
}