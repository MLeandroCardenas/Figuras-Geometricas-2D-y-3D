/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.figuras2d;
import java.util.Scanner;

/**
 *
 * @author Michael Cardenas
 * clase hija que hereda de la padre
 * especializa metodos de la interface
 */
public class Rectangulo extends FiguraBidimensional {
    
    /**
     * atributo de un rectangulo
     */
    private double ladoB;

    
    /**
     * constructor de la clase
     */
    public Rectangulo() {
    }
    
    /**
     * metodo especialiazado que calcula el area
     * @return devuelve el resultado final
     */
    @Override
    public double hallarArea() {
        return getLado()*ladoB;
    }

    /**
     * metodo especializado que calcula el perimetro
     * @return devuelve el resultado de calcular el perimetro
     */
    @Override
    public double hallarPerimetro() {
        return 2*getLado()+2*ladoB;
    }

    /**
     * metodos publicos para que otras clases accedan a los atributos privados
     * @return 
     */
    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    
    /**
     * metodo especializado que le pide datos al usuario
     */
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el lado 1: " );
        setLado(sc.nextDouble());
        System.out.println("Digite el lado 2: " );
        ladoB = sc.nextDouble();
        
        if(getLado()==ladoB){
            System.out.println("No es un rectangulo... un lado debe ser mayor al otro");
        }
    }
    
    /**
     * metodo especiaizado para imprimir los resultados finales
     */
    @Override
    public void imprimir() {
        if(getLado()==ladoB)
            System.out.println("No es rectangulo");
        else{
            setArea(hallarArea());
            setPerimetro(hallarPerimetro()); 
            System.out.println("Eligio rectangulo: su area es de " + getArea() + " cm2" + " y su perimetro es de " + getPerimetro() + " cm");
        }
    }
}
