/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.figuras3d;
import com.udec.figurasgeometricas.interfaces.IPedirDatos;
import com.udec.figurasgeometricas.interfaces.IMetodos3d;

/**
 *
 * @author Michael Cardenas
 * clase padre que hereda dos interfaces y que tiene metodos y atributos en comun de todas las clases hijas
 */
public abstract class FiguraTridimensional implements IPedirDatos,IMetodos3d{
    
    /**
     * atributo en comun para las hijas
     */
    private double volumen;
    /**
     * atributo en comun para las hijas
     */
    private double area;
    /**
     * atributo en comun para las hijas
     */
    private double lado;
    
    
    /**
     * constructor vacio de la clase
     */
    public FiguraTridimensional(){
        
    }

    /**
     * metodos publicos para acceder a los atributos privados
     * @return 
     */
    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}
