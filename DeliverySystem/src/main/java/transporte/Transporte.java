/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author salce
 */
public interface Transporte {
    double calcularCosto(double distancia, String tipoServicio);
    double calcularTiempoEntrega(double distancia);
}