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
    
    private double ladoB,ladoC;
    
    /**
     * metodo que implemento la clase padre de una interface y se especializo en la clase Cubo
     * pide los datos
     */
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la longitud de la arista inferior: ");
        setLado(sc.nextDouble());
        System.out.println("Digite la longitud de la arista lateral");
        ladoB = sc.nextDouble();
        System.out.println("Digite la longitud de la arista de fondo");
        ladoC = sc.nextDouble();
        
        if(ladoC!=getLado()|ladoC!=ladoB)
            System.out.println("No es un cubo perfecto la arista debe ser igual a la otra");
        else if(ladoC!=ladoB&ladoC!=getLado())
            System.out.println("No es un cubo perfecto la arista debe ser igual a la otra");
        else if(getLado()!=ladoB&ladoB!=ladoC&getLado()!=ladoC)
            System.out.println("No es un cubo perfecto la arista debe ser igual a la otra");
    }

    /**
     * metodo que implemento la clase padre de una interface y se especializo en la clase Cubo
     * imprime los resultados
     */
    @Override
    public void imprimir() {
        if(ladoC!=getLado()|ladoC!=ladoB)
            System.out.println("No es un cubo");
        else if(ladoC!=ladoB&ladoC!=getLado())
            System.out.println("No es un cubo");
        else if(getLado()!=ladoB&ladoB!=ladoC&getLado()!=ladoC)
            System.out.println("No es un cubo");
        else{
            setVolumen(hallarVolumen());
            setArea(hallarArea());
            System.out.println("Eligio cubo: el volumen del cubo es de " 
                    + getVolumen()  + " cm3 "+ " y el area del cubo es de " + getArea() + " cm2");
        }
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

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    
    
    
}
