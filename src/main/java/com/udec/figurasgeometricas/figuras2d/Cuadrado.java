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
public class Cuadrado extends FiguraBidimensional{
    
    
    public Cuadrado(){
        super();
    }

    @Override
    public double hallarArea() {
        return Math.pow(getLado(),2);
    }

    @Override
    public double hallarPerimetro() {
        return getLado()*4;
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el lado: ");
        setLado(sc.nextDouble());
    }

    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());
        
        System.out.println("Eligio cuadrado: su area es de-> " + getArea() + " y su perimetro es de " + getPerimetro());
    }
}
