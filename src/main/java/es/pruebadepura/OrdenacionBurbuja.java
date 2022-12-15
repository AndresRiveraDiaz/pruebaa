/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pruebadepura;

import java.util.Scanner;

/**
 *
 * @author astur
 */
public class OrdenacionBurbuja {
     public static void ordenar(int tamano, int[] vector) {
        int aux;
        for (int i=0; i< tamano; i++)
            for(int j=i+1; j< tamano; j++) {
                if (vector[j] < vector[i]) {
                    aux= vector[j];
                    vector[j]= vector[i];
                    vector[i]=aux;
                }
            }
    }

    private static void visualizarListado(int tamano, int[] vector) {
        for (int i=0; i<tamano;i++) {
            System.out.print(vector[i] + " ");
        }
    }
    private static final String MENSAJE_SOLICITUD = "Introduzca numero: ";

    public static int[] solicitarNumeros(int tamano, Scanner consola) {
        int[] vector;
        vector= new int[tamano];
        for (int i=0; i<tamano;i++) {
            System.out.println((i+1) + " N�mero?");
            vector[i]=consola.nextInt();
        }
        return vector;
    }
	
}

