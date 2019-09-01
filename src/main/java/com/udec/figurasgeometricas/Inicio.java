/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;

/**
 *
 * @author Michael Cardenas
 * clase donde esta el metodo donde inicia el programa
 */
public class Inicio {
    
    /**
     * 
     * @param args argumento tipo arreglo recibe n parametros
     * metodo que inicia el programa instanciando objeto de la clase donde empieza todo
     */
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.opciones();
    }
    
}
