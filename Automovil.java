/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Lenin
 */
public class Automovil extends Vehiculo {
    
    int numeroPuertas;

    public Automovil(int numeroRuedas, int velocidadMaxima, int numeroPuertas) {
        super(numeroRuedas,velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    void acelerar() {
        System.out.println("Acelerando el Vehiculo Velocidad actual: " + velocidadMaxima + " km/h");
    }
}
    

