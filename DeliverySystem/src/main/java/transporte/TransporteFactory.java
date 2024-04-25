/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author salce
 */
public class TransporteFactory {
    public static Transporte obtenerTransporte(String tipoTransporte) {
        switch (tipoTransporte) {
            case "Bicicleta":
                return new Bicicleta();
            case "Dron":
                return new Dron();
            case "Moto":
                return new Moto();
            case "Auto":
                return new Auto();
            default:
                return null;
        }
    }
}