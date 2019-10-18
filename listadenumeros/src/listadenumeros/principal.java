/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadenumeros;

import java.util.Scanner;


/**
 *
 * @author heuga
 */
public class principal {

    public static int leerentero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        int dato = leer.nextInt();
        return dato;
    }

    public static void main(String[] args) {
        Listanumeros Listanumeros = new Listanumeros();
        int opcion;
        do {
            System.out.println("Que desea hacer");
            System.out.println("1. Ingresar datos a la lista");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Eliminar datos");
            System.out.println("4. salir");
            opcion = leerentero("Seleccione una opcion");

            switch (opcion) {
                case 1: {
                    int nuevo = leerentero("ingrese el numero");
                    Listanumeros.agregarfin(nuevo);
                    break;
                }
                case 2: {
                    System.out.println("La lista es: ");
                    Listanumeros.imprimir();
                    break;
                }
                case 3: {
                    int valor = leerentero("¿Cual desea eliminar?");
                    Listanumeros.eliminar(valor);
                    break;
                }
                case 4: {
                    System.out.println("Hasta luego");
                    break;
                }
            }
        } while (opcion != 4);
    }
}
