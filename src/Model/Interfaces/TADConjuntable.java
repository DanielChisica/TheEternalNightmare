/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interfaces;

/**
 *
 * @author Johan Arenas
 */
public interface TADConjuntable {

    /**
     * Metodo que determina si un cojunto esta vacio o no
     *
     * @return retorna falso si tiene al menos un elementoy verdadero si no
     * contiene nada.
     */
    public boolean esVacio();

    /**
     * Metodo que retorna el numero de elementos que tiene un conjunto;
     *
     * @return el numero de elementos del conjunto;
     */
    public int tamanio();

    /**
     * Metodo que vacia el conjunto para dejarlo sin ningun elemento.
     */
    public void vaciar();

    /**
     * Metodo que agrega un elemento al conjunto.
     *
     * @param elemento es el elemento a agregar al conjunto
     */
    public void agregar(Object elemento);

    /**
     * Metodo que elimina un elemento del conjunto
     *
     * @param elemento -- metodo a eliminar
     */
    public void eliminar(Object elemento);

    /**
     * Metodo busca un elemnto en el cojunto
     *
     * @param elemento elemento que se quiere buscar
     * @return retorna verdadero si esta ele elemento falso si no esta.
     */
    public boolean contiene(Object elemento);

    /**
     * Metodo que obtiene la union de 2 conjuntos
     *
     * @param c el conjunto a unir
     * @return la union del conjunto.
     */
    public TADConjuntable union(TADConjuntable c);

    /**
     * Metodo que obtiene la interseccion de 2 conjuntos.
     *
     * @param c conjuto a encontrar la interseccion.
     * @return retorna la inetrseccion de los 2 conjuntos.
     */
    public TADConjuntable interseccion(TADConjuntable c);

    /**
     * Metodo que obtiene la diferencia de 2 conjuntos.
     *
     * @param c conjuto a encontrar la diferencia.
     * @return retorna la diferencia de los 2 conjuntos.
     */
    public TADConjuntable diferencia(TADConjuntable c);

    /**
     * Metodo que obtiene el subconjunto de un conjunto.
     *
     * @param c conjuto a encotrar el subconjunto.
     * @return retorna verdadero si hay un subconjunto.
     */
    public boolean subconjunto(TADConjuntable c);

    /**
     *
     * @return
     */
    public java.util.Iterator iterator();

}
