/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;
import java.util.Scanner;
import java.util.ArrayList;
import com.udec.figurasgeometricas.figuras2d.Cuadrado;
import com.udec.figurasgeometricas.figuras2d.Circulo;
import com.udec.figurasgeometricas.figuras2d.Rectangulo;
import com.udec.figurasgeometricas.figuras2d.Triangulo;
import com.udec.figurasgeometricas.interfaces.IPedirDatos;

/**
 *
 * @author michl
 */
public class Menu {
    
    ArrayList<IPedirDatos> general;
    Cuadrado cuadrado;
    Circulo circulo;
    Rectangulo rectangulo;
    Triangulo triangulo;
    
    public Menu() {
        cuadrado = new Cuadrado();
        circulo = new Circulo();
        rectangulo = new Rectangulo();
        triangulo = new Triangulo();
        general = new ArrayList<>();
    }

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
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    opcion=false;
                    recorrerArreglo();
            }
        }
    }
    
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
        }
    }
}