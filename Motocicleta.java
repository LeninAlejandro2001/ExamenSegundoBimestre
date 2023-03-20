/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Lenin
 */
public class Motocicleta  extends Vehiculo{

    boolean casco;

    public Motocicleta(int numeroRuedas, int velocidadMaxima, boolean casco) {
        super(numeroRuedas,velocidadMaxima);
        this.casco = casco;
    }

    @Override
    void acelerar() {
        System.out.println("Acelerando la motocicleta. Velocidad actual: " + velocidadMaxima + " km/h");
    }
}

    

