/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import Model.Interfaces.TADConjuntable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Set implements TADConjuntable {

    //Arreglo de datos para almacenarlos
    private Object[] datos;
    //contador de la cantidad de elementos.
    private int nElementos;

    public Set() {
        this(20);
    }

    /**
     * Constructor del conjunto.
     *
     * @param datos --
     * @param nElementos
     */
    public Set(Object[] datos, int nElementos) {
        this.datos = datos;
        this.nElementos = nElementos;
    }

    /**
     *
     * @param tam
     */
    public Set(int tam) {
        datos = new Object[tam <= 0 ? 20 : tam];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = null;
            nElementos = 0;
        }
    }

    public Object[] getDatos() {
        return datos;
    }

    public Object getDatos(int pos) {
        Object retorno = datos[pos];
        return retorno;
    }

    /**
     * Constructor de copia.
     *
     * @param c -- conjunto que se toma como valor inicial para crear el nuevo.
     */
    public Set(Set c) {
        datos = new Object[c.datos.length];
        for (int i = 0; i < c.datos.length; i++) {
            datos[i] = c.datos[i];
            nElementos = c.nElementos;
        }
    }

    /**
     * Metodo que determina si un cojunto esta vacio o no
     *
     * @return retorna falso si tiene al menos un elementoy verdadero si no
     * contiene nada.
     */
    public boolean esVacio() {
        return nElementos <= 0;
    }

    /**
     * Metodo que retorna el numero de elementos que tiene un conjunto;
     *
     * @return el numero de elementos del conjunto;
     */
    @Override
    public int tamanio() {
        return nElementos;
    }

    /**
     * Metodo que vacia el conjunto para dejarlo sin ningun elemento.
     */
    @Override
    public void vaciar() {
        nElementos = 0;
    }

    /**
     * Metodo que agrega un elemento al conjunto
     *
     * @param elemento-- elemento a agregar al conjunto
     */
    @Override
    public void agregar(Object elemento) {
        if (!contiene(elemento)) {
            if (nElementos >= datos.length) {
                crecerArreglo();
            }
            datos[nElementos++] = elemento;
        }
    }

    /**
     * Metodo que elimina un elemento del conjunto
     *
     * @param elemento -- metodo a eliminar
     */
    @Override
    public void eliminar(Object elemento) {
        if (!esVacio()) {
            for (int i = 0; i < nElementos; i++) {
                if (datos[i].equals(elemento)) {
                    datos[i] = datos[nElementos--];
                    break;
                }
            }
        }
    }

    @Override
    public boolean contiene(Object elemento) {
        if (!esVacio()) {
            for (int i = 0; i < nElementos; i++) {
                if (datos[i].equals(elemento)) {
                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Metodo que hace que el arreglo se incremente en 10;
     */
    private void crecerArreglo() {
        int tamanioNuevo = datos.length + 10;
        Object[] nuevo = new Object[tamanioNuevo];
        for (int i = 0; i < nElementos; i++) {
            nuevo[i] = datos[i];
        }
        datos = nuevo;
    }

    /**
     * Metodo que obtiene la union de 2 conjuntos
     *
     * @param c el conjunto a unir
     * @return la union del conjunto.
     */
    @Override
    public TADConjuntable union(TADConjuntable c) {
        Set conjuntoUnion = new Set(this);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            conjuntoUnion.agregar(nElementos);
        }
        return conjuntoUnion;
    }

    @Override
    public TADConjuntable interseccion(TADConjuntable c) {
        Set conjuntoInterseccion = new Set(this);
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!c.contiene(next)) {
                conjuntoInterseccion.eliminar(next);
            }

        }
        return conjuntoInterseccion;
    }

    @Override
    public TADConjuntable diferencia(TADConjuntable c) {
        Set diferencia = new Set(this);
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c.contiene(next)) {
                diferencia.eliminar(next);
            }
        }

        return diferencia;
    }

    @Override
    public boolean subconjunto(TADConjuntable c) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!c.contiene(next)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator iterator() {
        return new miIterator();
    }

    private class miIterator implements Iterator {

        private int pos; //indice para recorrer el conjunto

        public miIterator() {
            pos = 0;
        }

        /**
         * Determina si hay aun elementos en el conjunto
         */
        @Override
        public boolean hasNext() {
            return (pos < nElementos);
        }

        /**
         * Devuelve el siguiente elemento en el conjunto y avanza el indice en
         * una posicion
         */
        @Override
        public Object next() throws NoSuchElementException {
            if (hasNext()) {
                return datos[pos++];
            }
            throw new NoSuchElementException("No hay elementos en el conjunto");

        }

        @Override
        public void remove() {
            Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void forEachRemaining(Consumer action) {
            Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
