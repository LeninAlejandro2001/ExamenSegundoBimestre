/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Lenin
 */
public  abstract class Vehiculo {
  
    int numeroRuedas;
    int velocidadMaxima;

    public Vehiculo(int numeroRuedas, int velocidadMaxima) {
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
    }

    abstract void acelerar();
}

