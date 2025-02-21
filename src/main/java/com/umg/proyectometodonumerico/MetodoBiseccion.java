/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyectometodonumerico;

/**
 *
 * @author jciri
 */
public class MetodoBiseccion {
    
    private double _ecuacion;
    private int _intervaloA;
    private int _intervaloB;
    
    //constructor
    
    public MetodoBiseccion(double ecuacion, int intervaloA, int intervaloB)
    {
        _ecuacion = ecuacion;
        _intervaloA = intervaloA; 
        _intervaloB = intervaloB; 
    
    }
    
    
    public void mostrarResultado()
    {
        System.out.println("la ecuacion es: " + _ecuacion + " el intervalo a: " + _intervaloA + " el intervalo b: " + _intervaloB);
    }
    
}
