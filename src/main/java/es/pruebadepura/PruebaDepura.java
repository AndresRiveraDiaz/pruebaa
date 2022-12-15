/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pruebadepura;
import java.util.Scanner;
public class PruebaDepura{

	public static void main(String[] args) {
		int tamano;
		int vector[];
                OrdenacionBurbuja ordenacion;
		
		Scanner consola = new Scanner (System.in);
		System.out.print(MENSAJE_SOLICITUD);
		tamano= consola.nextInt();
		vector= solicitarNumeros(tamano, consola);
		
        visualizarListado(tamano, vector);
		
//	
		int aux;
        ordenar(tamano, vector);
		
		
		System.out.println("\n");
		System.out.println("El resultado: ");
        visualizarListado(tamano, vector);
	 
	
}

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