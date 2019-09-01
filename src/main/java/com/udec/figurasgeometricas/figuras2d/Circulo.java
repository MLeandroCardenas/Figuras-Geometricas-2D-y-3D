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
public class Circulo extends FiguraBidimensional {
    
    private double radio;

    public Circulo() {
    }
    
    
    @Override
    public double hallarArea() {
        return Math.PI*Math.pow(getRadio(),2);
    }
    

    @Override
    public double hallarPerimetro() {
        return 2*Math.PI*getRadio();
    }
    
    public double hallarLongitud(){
        return 2*Math.PI*getRadio();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void pedirDatos() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite el radio del circulo: ");
        radio = sc.nextDouble();
        setRadio(radio);
    } 
   
    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());
        double longitudAux = hallarLongitud();
        System.out.println("Eligio circulo su area es de -> " +getArea() + 
                " su perimetro es de -> " +getPerimetro() + " su longitud es de -> " + longitudAux);
    }
}
