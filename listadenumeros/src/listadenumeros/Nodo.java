/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadenumeros;

/**
 *
 * @author heuga
 */
public class Nodo {

    private int dato;
    private Nodo ultimo;

    public Nodo(int dato, Nodo ultimo) {
        this.dato = dato;
        this.ultimo = ultimo;
    }

    public Nodo(int datos) {
        this.dato = datos;
        this.ultimo = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

}
