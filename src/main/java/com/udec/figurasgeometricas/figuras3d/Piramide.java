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
 * clase hija que especializa metodos
 */
public class Piramide extends FiguraTridimensional {
    
    /**
     * atributo unico de la clase
     */
    private double altura,base;

    /**
     * metodo especializado para pedir datos
     */
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        byte opcion  = 0;
        System.out.println("Digite la altura de la piramide");
        altura = sc.nextDouble();
        System.out.println("Digite la base de la piramide");
        setLado(sc.nextDouble());
        
        System.out.println("1) ¿Base triangular?");
        System.out.println("2) ¿Base cuadrada?");
        opcion = sc.nextByte();
        
        if(opcion ==1)
            setLado(calcularBaseTrinagular());
        else
            setLado(calcularBaseCuadrada());
    }

    /**
     * metodo especializado de la clase para imprimir los resultados
     */
    @Override
    public void imprimir() {
        setVolumen(hallarVolumen());
        setArea(hallarArea());
        System.out.println("Eligio piramide: el volumen de la piramide es de " + getVolumen() + " cm3" + " y el area es de " + getArea() + " cm2");
    }

    /**
     * metodos publicos para acceder a los atributos privados de la clase
     * @return 
     */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * metodo especializado para hallar el volumen
     * @return  el resultado final
     */
    @Override
    public double hallarVolumen() { 
        return base*altura/3;
    }

    /**
     * metodo especializado para hallar el area
     * @return el area de la piramide 
     */
    @Override
    public double hallarArea() {
        double areaLateral,apotema,resultado;
        setLado(getLado()/2);
        apotema = Math.sqrt(Math.pow(altura,2)+Math.pow(getLado(),2));
        areaLateral = base*apotema/2;
        resultado = base+areaLateral;
        setArea(resultado);
        return resultado;
    }
    
    /**
     * metodo propio para calcular la base si es tringular
     * @return devuelve el valor de la base
     */
    public double calcularBaseTrinagular(){
        base = getLado()*altura/2;
        return base;
    }
    
    /**
     * metodo propio para calcular la base si es cuadrada
     * @return devuelve el valor de la base
     */
    public double calcularBaseCuadrada(){
        base = Math.pow(getLado(),2);
        return base;
    }

    /**
     * metodos publicos para acceder a los atributos privados
     * @return 
     */
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
