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
 * clase hija que hereda de la padre e implementa metodos de una interface y los especializa
 */
public class Cuadrado extends FiguraBidimensional{
    
    
    /**
     * constructor que inicializa objetos de la clase
     */
    public Cuadrado(){
        super();
    }
    
    /**
     * calcula el area es un metodo especializaado en esta clase que viene de una interface
     * @return devuelve el resultado final 
     */

    @Override
    public double hallarArea() {
        return Math.pow(getLado(),2);
    }

    /**
     * metodo especializado que viene de una interface
     * @return devuelve el resultado final
     */
    @Override
    public double hallarPerimetro() {
        return getLado()*4;
    }
    
    /**
     * metodo especializado que se usa para pedir los datos al usuario
     */

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el lado: ");
        setLado(sc.nextDouble());
    }

    /**
     * metodo especializado para imprimir los resultadoss finales
     */
    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());
        
        System.out.println("Eligio cuadrado: su area es de-> " + getArea() + " cm2" + " y su perimetro es de " + getPerimetro() + " cm");
    }
}
