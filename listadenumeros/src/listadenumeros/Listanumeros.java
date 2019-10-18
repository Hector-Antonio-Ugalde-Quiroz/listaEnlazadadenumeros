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
public class Listanumeros {

    private Nodo inicio;
    private Nodo fin;

    public Listanumeros() {
        inicio = fin = null;
    }

    public void agregarfin(int info) {
        Nodo nuevo = new Nodo(info);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setUltimo(nuevo);
            fin = nuevo;
        }
    }

    public void imprimir() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getUltimo();
        }
    }

    public void eliminar(int valor) {
        Nodo anterior = inicio;
        Nodo aux = inicio.getUltimo();
        Nodo temp;
        while (aux != null) {
            if (aux.getDato() > valor) {
                temp = aux.getUltimo();
                anterior.setUltimo(aux.getUltimo());
                aux = temp;
            } else {
                anterior = anterior.getUltimo();
                aux = aux.getUltimo();
            }
        }
    }
}
