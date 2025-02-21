/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyectometodonumerico;

import java.util.Scanner;

/**
 *
 * @author jciri
 */
public class Main {
    //Llamar scanner
    Scanner scanner = new Scanner (System.in);
    double ecuacion = 0;
    int intervaloA = 0;
    int intervaloB = 0; 

    public void Iniciar() {

        System.out.println("Bienvenidos a nuestro proyecto de metodos numericos");
        System.out.println("Ingrese la ecuacion: ");
        ecuacion  = scanner.nextDouble();
        System.out.println("Ingrese intervalo a: ");
        intervaloA = scanner.nextInt();
        System.out.println("Ingrese intervalo b: ");
        intervaloB = scanner.nextInt(); 
        
        
        //objeto para utilizar la clase de metodoBiseccion e ingresar los datos
        
        MetodoBiseccion mb1 = new MetodoBiseccion(ecuacion,intervaloA,intervaloB);
        
        
        //metodo para mostrar el resultado
        mb1.mostrarResultado();
        
        
        
        
        
        
        
        
        
        

    }

}
