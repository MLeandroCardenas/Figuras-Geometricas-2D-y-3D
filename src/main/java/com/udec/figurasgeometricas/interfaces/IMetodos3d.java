/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.interfaces;

/**
 *
 * @author Michael Cardenas 
 * interface con metodos publicos que lo implementara la clase padre de las 3d y sus hijas
 */
public interface IMetodos3d {
    
    /**
     * metodo publico que lo especializaran las hijas
     * @return devuelve el volumen
     */
    public double hallarVolumen();
    
    /**
     * metodo publico que lo especializaran las hijas
     * @return devuelve el area
     */
    public double hallarArea();
}
