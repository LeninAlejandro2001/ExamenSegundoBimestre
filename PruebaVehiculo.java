/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Lenin
 */
public class PruebaVehiculo {
    
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Automovil(4, 200, 5);
        vehiculos[1] = new Motocicleta(2, 120, true);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();
        }
    }
}

