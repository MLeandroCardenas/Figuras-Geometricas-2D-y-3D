/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas.interfaces;

/**
 *
 * @author Michael Cardenas
 * interface con metodos publicos que la implentaran tanto las 2d como las 3d
 * clave para la lista de objetos
 */
public interface IPedirDatos {
    
    /**
     * metodo sin especializar que lo haran todas las clases hijas 2d y 3d
     */
    public void pedirDatos();
    
    /**
     * metodo sin especializar que lo haran todas las clases hijas 2d y 3d
     */
    public void imprimir();
}
