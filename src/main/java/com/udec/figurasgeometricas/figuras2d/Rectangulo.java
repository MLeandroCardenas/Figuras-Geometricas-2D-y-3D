/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.figuras2d;
import java.util.Scanner;

/**
 *
 * @author michl
 */
public class Rectangulo extends FiguraBidimensional {
    
    private double ladoB;

    public Rectangulo() {
    }
    
    @Override
    public double hallarArea() {
        return getLado()*ladoB;
    }

    @Override
    public double hallarPerimetro() {
        return 2*getLado()+2*ladoB;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el lado 1: " );
        setLado(sc.nextDouble());
        System.out.println("Digite el lado 2: " );
        ladoB = sc.nextDouble();
        
        if(getLado()==ladoB)
            System.out.println("No es un rectangulo... un lado debe ser mayor al otro");
    }

    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());     
        System.out.println("Eligio rectangulo: su area es de + " + getArea() + " y su perimetro es de " + getPerimetro());
    }
}
