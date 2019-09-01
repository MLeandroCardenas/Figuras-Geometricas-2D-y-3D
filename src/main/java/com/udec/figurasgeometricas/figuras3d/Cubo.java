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
 * clase que implementa metodos de una interface y los especializa
 * es clase hija
 */
public class Cubo extends FiguraTridimensional {
    
    /**
     * metodo que implemento la clase padre de una interface y se especializo en la clase Cubo
     * pide los datos
     */
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la longitud de la arista: ");
        setLado(sc.nextDouble());
    }

    /**
     * metodo que implemento la clase padre de una interface y se especializo en la clase Cubo
     * imprime los resultados
     */
    @Override
    public void imprimir() {
        setVolumen(hallarVolumen());
        setArea(hallarArea());
        System.out.println("Eligio cubo: el volumen del cubo es de " 
                + getVolumen() + " y el area del cubo es de " + getArea());
    }

    /**
     * metodo que implemento la clase padre de una interface y se especializo en la clase Cubo
     * halla el volumen del cubo
     */
    @Override
    public double hallarVolumen() {
        return Math.pow(getLado(),3);
    }

    /**
     * metodo que implemento la clase padre de una interface y se especializo en la clase Cubo
     * halla el area
     */
    @Override
    public double hallarArea() {
        return 6*Math.pow(getLado(),2);
    }
}
