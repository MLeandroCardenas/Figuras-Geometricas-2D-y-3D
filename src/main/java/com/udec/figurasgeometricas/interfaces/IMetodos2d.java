/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.interfaces;

/**
 *
 * @author Michael Cardenas
 * interface con metodos publicos que implementara la clase padre de las figuras 2d y sus hijas
 */
public interface IMetodos2d {
    /**
     * metodo publico sin especializar que lo haran las hijas
     * @return devuelve el area 
     */
    
    public double hallarArea();
    /**
     * metodo publico sin especializar que lo haran las hijas
     * @return devuelve el perimetro
     */
    public double hallarPerimetro();
}
