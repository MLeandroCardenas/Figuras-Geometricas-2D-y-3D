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
     * controla el menu que se le muestra al usuario
     */
    private boolean opcion;
    
    /**
     * es la opcion que elige el usuario
     */
    private byte eleccion;
    
    /**
     *constructor vacio de la clase que inicializa el objeto 
     */
    public Menu() {
        general = new ArrayList<>();
    }

    /**
     * metodo propio para mostrarle la opcion al usuario
     */
    public void menu(){
        opcion = true;
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
            
            eleccion = teclado.nextByte();
            opcionesDos(eleccion,opcion);
        }
    }
    /**
     * Metodo que tiene el menu principal y le muestra al usuario las opciones
     */
    public void opcionesDos(byte eleegir,boolean estado){
            switch(eleegir){
                case 1: 
                    crearCuadrado();
                    break;
                case 2: 
                    crearRectangulo();
                    break;
                case 3: 
                    crearCirculo();
                    break;
                case 4: 
                    crearTriangulo();
                    break;
                case 5: 
                    crearCubo();
                    break;
                case 6: 
                    crearEsfera();
                    break;
                case 7: 
                    crearPiramide();
                    break;
                default: 
                    porDefecto(estado);
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
    
    
    /**
     * metodo para crear el objeto de la clase Cuadrado
     */
    private void crearCuadrado(){
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.pedirDatos();
        general.add(cuadrado);
    }
    
    /**
     * metodo para crear el objeto de la clase Rectangulo
     */
    private void crearRectangulo(){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.pedirDatos();
        general.add(rectangulo);
    }
    
    /**
     * metodo para crear el objeto de la clase Circulo
     */
    private void crearCirculo(){
        Circulo circulo = new Circulo();
        circulo.pedirDatos();
        general.add(circulo);
    }
    
    /**
     * metodo para crear el objeto de la clase Triangulo
     */
    private void crearTriangulo(){
        Triangulo triangulo = new Triangulo();
        triangulo.pedirDatos();
        general.add(triangulo);
    }
    
    
    /**
     * metodo para crear el objeto de la clase Cubo
     */
    private void crearCubo(){
        Cubo cubo = new Cubo();
        cubo.pedirDatos();
        general.add(cubo);
    }
    
    /**
     * metodo para crear el objeto de la clase Esfera
     */
    private void crearEsfera(){
        Esfera esfera = new Esfera();
        esfera.pedirDatos();
        general.add(esfera);
    }
    
    /**
     * metodo para crear el objeto de la clase Piramide
     */
    private void crearPiramide(){
        Piramide piramide = new Piramide();
        piramide.pedirDatos();
        general.add(piramide);
    }
    
    /**
     * metodo que se ejecuta si sale del programa el usuario
     */
    private void porDefecto(boolean estado){
        estado=false;
        recorrerArreglo();
        setOpcion(false);
    }

    /**
     * metodos publicos para acceder los atributos privados
     * @return 
     */
    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion = opcion;
    }

    public byte getEleccion() {
        return eleccion;
    }

    public void setEleccion(byte eleccion) {
        this.eleccion = eleccion;
    }
}
