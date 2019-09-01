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
 * clase hija que hereda de la clase padre y especializa metodos de una interface
 */
public class Circulo extends FiguraBidimensional {
    
    /**
     * aributo unico del circulo y necesario para los calculos
     */
    private double radio;

    /**
     * Constructor vacio inicializa el objeto
     */
    public Circulo() {
    }
    
    
    /**
     * metodo de una interface que se especializa en esta clase
     * @return devuelve el resultado del area
     */
    @Override
    public double hallarArea() {
        return Math.PI*Math.pow(getRadio(),2);
    }
    

    /**
     * metodo de una interface que se especializa en esta clase
     * @return  devuelve el resultado de calcular perimetro
     */
    @Override
    public double hallarPerimetro() {
        return 2*Math.PI*getRadio();
    }
    
    /**
     * metodo propio de la clase
     * @return devuelve el resultado de la longitud 
     */
    public double hallarLongitud(){
        return 2*Math.PI*getRadio();
    }

    /**
     * metodos publicos para acceder a las variables privadas desde otra clase
     * @return 
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * metodo especializado en esta clase que viene de una interfaz
     */

    @Override
    public void pedirDatos() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite el radio del circulo: ");
        radio = sc.nextDouble();
        setRadio(radio);
    } 
   
    /**
     * metodo especializado que se usa para imprimir los resultados
     */
    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());
        double longitudAux = hallarLongitud();
        System.out.println("Eligio circulo su area es de -> " +getArea() + 
                " su perimetro es de -> " +getPerimetro() + " su longitud es de -> " + longitudAux);
    }
}
