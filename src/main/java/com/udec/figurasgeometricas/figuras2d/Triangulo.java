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
public class Triangulo extends FiguraBidimensional {
    
    private double base;
    private double altura;
    
    
    public Triangulo() {
    }
    
    @Override
    public double hallarArea() {
        return (base*altura)/2;
    }

    @Override
    public double hallarPerimetro() {
        setLado(Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)));
        return  getLado()+base+altura;
    }
    
    public void decirTipoTrianqulo(double lado1,double lado2, double lado3){
        if(lado1==lado2&lado1==lado3&lado2==lado3)
            System.out.println("Es un triagulo equilatero");
        else if(lado1==lado2|lado1==lado3|lado2==lado3)
            System.out.println("Es un triagulo isosceles");
        else if(lado1!=lado2&lado1!=lado3&lado2!=lado3)
            System.out.println("Es un triagulo escaleno");
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la base: ");
        base = sc.nextDouble();
        System.out.println("Digite la altura: ");
        altura = sc.nextDouble();
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());
        System.out.println("Eligio triangulo: su area es de " + getArea() + " su perimetro es de " + getPerimetro());
        System.out.println("Su clasificacion es: ");
        decirTipoTrianqulo(base, altura, getLado());
    }
}
