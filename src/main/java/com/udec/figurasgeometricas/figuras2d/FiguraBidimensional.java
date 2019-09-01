/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.figuras2d;
import com.udec.figurasgeometricas.interfaces.IMetodos2d;
import com.udec.figurasgeometricas.interfaces.IPedirDatos;
/**
 *
 * @author Michael Cardenas
 * clase padre que sirve como esqueleto y tiene todo lo comun de las hijas
 * implementa dos interfaces
 */

public abstract class FiguraBidimensional implements IMetodos2d,IPedirDatos {
    
    /**
     * atributo en comunn de las hijas
     */
    private double lado;
    
    /**
     * atributo en comunn de las hijas
     */
    private double area;
    
    /**
     * atributo en comunn de las hijas
     */
    private double perimetro;

    /**
     * constructor de la clase
     */
    public FiguraBidimensional() {
    }
    
    
    /**
     * metodos publicos para que las hijas puedan acceder a los atributos de la clase
     * @return 
     */
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }  
}
