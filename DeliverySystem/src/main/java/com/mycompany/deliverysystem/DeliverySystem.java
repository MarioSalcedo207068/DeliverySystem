/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverysystem;

import delivery.Servicio;

/**
 *
 * @author salce
 */
public class DeliverySystem {

    public static void main(String[] args) {
    // Creamos una instancia de Servicio con los parámetros deseados
        Servicio servicio = new Servicio("Estándar", "Pequeño", 4);
        
        // Se calcula el costo y tiempo de entrega utilizando una bicicleta
        double[] resultado = servicio.calcularCostoTiempo("Bicicleta");
        double costo = resultado[0];
        double tiempo = resultado[1];
        
        // Impresión
        System.out.println("El costo del servicio es de: $" + costo 
                + ", se entregará en bicicleta, en un tiempo aproximado de " + tiempo + " horas.");
        
    }
}