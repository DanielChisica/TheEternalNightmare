/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * This class creates a Node, this is a kind of object that have a element and a
 * reference, at the same time the reference is other Node
 *
 * @author Daniel Jiménez
 * @param <T> Generic Data Type
 * @since 10 March 2017
 */
public class Node<T> {

    /**
     * The constructor can build the node with the input attributes
     *
     * @param element The object of the node
     * @param next The next element
     */
    public Node(T element, T next) {
        this.element = element;
        this.next = next;
    }

    /**
     * Initializes a node with its element
     *
     * @param element The input element
     */
    public Node(T element) {
        this.element = element;
    }

    /**
     * Returns the element of the node
     *
     * @return The object of the node
     */
    public T getElement() {
        return element;
    }

    /**
     * Sets the element of the node
     *
     * @param element The input element
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Returns the the reference to the next object
     *
     * @return The next element
     */
    public T getNext() {
        return next;
    }

    /**
     * Configurates the reference to the next element
     *
     * @param next A next node
     */
    public void setNext(T next) {
        this.next = next;
    }
    protected T element;
    protected T next;
}
