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
    private double ladoB;
    
    /**
     * atributo unico de esta clase
     */
    private double ladoC;
    
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
        double semiperimetro,areaAux,semiladoA,semiLadoB,semiLadoC;
        
        semiperimetro = (getLado()+ladoB+ladoC)/2;
        semiladoA = semiperimetro-getLado();
        semiLadoB = semiperimetro-ladoB;
        semiLadoC = semiperimetro-ladoC;
        
        areaAux = Math.sqrt(semiperimetro*(semiladoA)*(semiLadoB)*(semiLadoC));
        return areaAux;
    }

    /**
     * metodo especializado para hallar el perimetro
     * @return  devuelve el resultado
     */
    @Override
    public double hallarPerimetro() {
       String tipo = decirTipoTrianqulo(getLado(),ladoB, ladoC);
       if(tipo.equals("Triangulo equilatero"))
           return 3*getLado();
       else if(tipo.equals("Triangulo isosceles"))
           return 2*getLado()+ladoB;
       else if(tipo.equals("Triangulo escaleno")) 
           return getLado()+ladoB+ladoC;    
        return 0.0;
    }
    
    /**
     * metodo propio de la clase para hallar la clasificacion del triangulo
     * @param lado1 recibe un lado del triangulo
     * @param lado2 recibe un lado del triangulo
     * @param lado3 recibe un lado del triangulo
     */
    public String decirTipoTrianqulo(double lado1,double lado2, double lado3){
        if(lado1==lado2&lado1==lado3&lado2==lado3)
            return "Triangulo equilatero";
        else if(lado1==lado2|lado1==lado3|lado2==lado3)
            return "Triangulo isosceles";
        else if(lado1!=lado2&lado1!=lado3&lado2!=lado3)
            return "Triangulo escaleno";
        
        return "";
    }

    /**
     * metodo especialiazado que pide datos al usuario
     */
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el lado 1");
        setLado(sc.nextDouble());
        System.out.println("Digite el lado 2");
        ladoB = sc.nextDouble();
        System.out.println("Digite el lado 3");
        ladoC = sc.nextDouble();
    }
    
    /**
     * metodos publicos para acceder a los atributos privados de la clase
     * @return 
     */

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
    
    /**
     * metodo especializado para imprimir los resultados finales 
     */
    @Override
    public void imprimir() {
        setArea(hallarArea());
        setPerimetro(hallarPerimetro());
        System.out.println("Eligio triangulo: su area es de " + getArea() +" cm2 " + " su perimetro es de " + getPerimetro() + " cm");
        System.out.println("Su clasificacion es: ");
        System.out.println(decirTipoTrianqulo(getLado(),ladoB,ladoC));
    }
}
