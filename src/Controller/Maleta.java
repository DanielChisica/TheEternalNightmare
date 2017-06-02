/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Conjunto;
import Model.ObjectBag;
import java.util.Stack;

/**
 *
 * @author Johan Arenas
 */
public class Maleta {

    private final Conjunto contenido; //contenido de la maleta
    private Stack<ObjectBag> pociones;

    public Maleta() {
        contenido = new Conjunto();

    }

    /**
     * Añade un elemento al conjunto Contenido de la maleta
     *
     * @param e Va a ser nuestro elemento
     */
    public void añadirContenido(ObjectBag e) {
        contenido.agregar(e);
    }

    /**
     * Verifica si tiene todos los necesarios para un soldado
     *
     * @return
     */
    

}
