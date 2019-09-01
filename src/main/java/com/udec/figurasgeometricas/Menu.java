/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;
import java.util.Scanner;
import java.util.ArrayList;
import com.udec.figurasgeometricas.figuras2d.*;
import com.udec.figurasgeometricas.interfaces.IPedirDatos;
import com.udec.figurasgeometricas.figuras3d.*;

/**
 *
 * @author Michael Cardenas
 * clase donde se recorre la lista de objetos y se dirige el programa dependiendo de la eleccion 
 * del usuario
 */
public class Menu {
    
    /**
     * lista que recibe cualquier objeto de la clase que implemente la interface de IPedirDatos
     */
    ArrayList<IPedirDatos> general;
    
    /**
     * objeto tipo clase de la clase Cuadrado para llamar al metodo donde se piden los datos
     */
    Cuadrado cuadrado;
    
    /**
     * objeto tipo clase de la clase Circulo para llamar al metodo donde se piden los datos
     */
    Circulo circulo;
    
    /**
     * objeto tipo clase de la clase Rectangulo para llamar al metodo donde se piden los datos
     */
    Rectangulo rectangulo;
    
    /**
     * objeto tipo clase de la clase Triangulo para llamar al metodo donde se piden los datos
     */
    Triangulo triangulo;
    
    /**
     * objeto tipo clase de la clase Cubo para llamar al metodo donde se piden los datos
     */
    Cubo cubo;
    
    /**
     * objeto tipo clase de la clase Esfera para llamar al metodo donde se piden los datos
     */
    Esfera esfera;
    
    /**
     * objeto tipo clase de la clase Piramide para llamar al metodo donde se piden los datos
     */
    Piramide piramide;
    
    /**
     *constructor vacio de la clase que inicializa el objeto 
     */
    public Menu() {
        cuadrado = new Cuadrado();
        circulo = new Circulo();
        rectangulo = new Rectangulo();
        triangulo = new Triangulo();
        cubo = new Cubo();
        esfera = new Esfera();
        piramide = new Piramide();
        general = new ArrayList<>();
    }

    /**
     * Metodo que tiene el menu principal y le muestra al usuario las opciones
     */
    public void opciones(){
        boolean opcion = true;
        byte opciones;
        while(opcion){
            Scanner teclado = new Scanner(System.in);
           System.out.println("\t FIGURAS GEOMETRICAS \t");
            System.out.println("Seleccione una opcion");
            System.out.println("\t 1. Cuadrado \t");
            System.out.println("\t 2. Rectangulo \t");
            System.out.println("\t 3. Circulo \t");
            System.out.println("\t 4. Triangulo \t");
            System.out.println("\t 5. Cubo \t");
            System.out.println("\t 6. Esfera \t");
            System.out.println("\t 7. Piramide \t");
            System.out.println("\t 8. Salir \t");
            
            opciones = teclado.nextByte();
            
            switch(opciones){
                case 1:
                    cuadrado.pedirDatos();
                    general.add(cuadrado);
                    break;
                case 2:
                    rectangulo.pedirDatos();
                    general.add(rectangulo);
                    break;
                case 3:
                    circulo.pedirDatos();
                    general.add(circulo);
                    break;
                case 4:
                    triangulo.pedirDatos();
                    general.add(triangulo);
                    break;
                case 5:
                    cubo.pedirDatos();
                    general.add(cubo);
                    break;
                case 6:
                    esfera.pedirDatos();
                    general.add(esfera);
                    break;
                case 7:
                    piramide.pedirDatos();
                    general.add(piramide);
                    break;
                default:
                    opcion=false;
                    recorrerArreglo();
            }
        }
    }
    
    
    /**
     * metodo que recorre la lista de objetos e imprime los resultados dependiendo de la instancia que llego
     */
    private void recorrerArreglo(){
        for (IPedirDatos objecto : general) {
            if(objecto instanceof Cuadrado)
                ((Cuadrado) objecto).imprimir();
            else if(objecto instanceof Rectangulo)
                ((Rectangulo) objecto).imprimir();
            else if(objecto instanceof Circulo)
                ((Circulo) objecto).imprimir();
            else if(objecto instanceof Triangulo)
                ((Triangulo) objecto).imprimir();
            else if(objecto instanceof Cubo)
                ((Cubo) objecto).imprimir();
            else if(objecto instanceof Esfera)
                ((Esfera) objecto).imprimir();
            else
                ((Piramide) objecto).imprimir();
        }
    }
}