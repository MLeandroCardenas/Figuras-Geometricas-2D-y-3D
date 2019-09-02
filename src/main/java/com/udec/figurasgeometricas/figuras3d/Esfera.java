/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.figuras3d;
import java.util.Scanner;

/**
 *
 * @author Michael Cardenas
 * hereda de la clase padre y especializa metodos de una interfaz
 */
public class Esfera extends FiguraTridimensional {
    
    /**
     * propiedad unica del circulo para hacer los calculos
     */
    private double radio;

    /**
     * metodo que implemento la clase padre y esta clase lo especializa
     * pide los datos al usuario
     */
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el radio de la esfera");
        radio = sc.nextDouble();
    }
    
    /**
     * metodo que implemento la clase padre y esta clase lo especializa
     * imprime los resultados
     */
    
    @Override
    public void imprimir() {
        setVolumen(hallarVolumen());
        setArea(hallarArea());
        System.out.println("Eligio esfera: su volumen es de " + getVolumen() + " cm3" + " y su area es de " + getArea() + " cm2");
    }

    /**
     * metodo especializado para hallar el volumen
     * @return devuelve el resultado del cubo
     */
    @Override
    public double hallarVolumen() {
        return 4/3*Math.PI*Math.pow(radio,3);
    }

    /**
     * metodo especializado para hallar el area
     * @return el resultado de el area
     */
    @Override
    public double hallarArea() {
        return 4*Math.PI*Math.pow(radio,2);
    }
}
