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
 * clase hija que hereda de la padre e implementa metodos y los especializa
 */
public class Triangulo extends FiguraBidimensional {
    
    /**
     * atributo unico de esta clase
     */
    private double base;
    
    /**
     * atributo unico de esta clase
     */
    private double altura;
    
    
    /**
     * constructor de la clase vacio para inicializar
     */
    public Triangulo() {
    }
    
    /**
     * metodo especializado para hallar el area
     * @return  devuelve el resultado
     */
    @Override
    public double hallarArea() {
        return (base*altura)/2;
    }

    /**
     * metodo especializado para hallar el perimetro
     * @return  devuelve el resultado
     */
    @Override
    public double hallarPerimetro() {
        setLado(Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)));
        return  getLado()+base+altura;
    }
    
    /**
     * metodo propio de la clase para hallar la clasificacion del triangulo
     * @param lado1 recibe un lado del triangulo
     * @param lado2 recibe un lado del triangulo
     * @param lado3 recibe un lado del triangulo
     */
    public void decirTipoTrianqulo(double lado1,double lado2, double lado3){
        if(lado1==lado2&lado1==lado3&lado2==lado3)
            System.out.println("Es un triagulo equilatero");
        else if(lado1==lado2|lado1==lado3|lado2==lado3)
            System.out.println("Es un triagulo isosceles");
        else if(lado1!=lado2&lado1!=lado3&lado2!=lado3)
            System.out.println("Es un triagulo escaleno");
    }

    /**
     * metodo especialiazado que pide datos al usuario
     */
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la base: ");
        base = sc.nextDouble();
        System.out.println("Digite la altura: ");
        altura = sc.nextDouble();
    }
    

    /**
     * metodos publicos para acceder a los atributos privados de la clase
     * @return 
     */
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

    /**
     * metodo especializado para imprimir los resultados finales 
     */
    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());
        System.out.println("Eligio triangulo: su area es de " + getArea() + " su perimetro es de " + getPerimetro());
        System.out.println("Su clasificacion es: ");
        decirTipoTrianqulo(base, altura, getLado());
    }
}
