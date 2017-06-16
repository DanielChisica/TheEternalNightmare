/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Class that implements bound nodes making a Queue
 *
 * @author Daniel Jiménez Chísica
 * @since 20 March 2017
 */
public class Queue {

    protected Node start;
    protected Node end;
    protected int nData;

    /**
     * This constructor initializes the queue
     */
    public Queue() {
        start = null;
        end = null;
        nData = 0;
    }

    /**
     * Asks to the queue if is empty
     *
     * @return boolean True if it's empty, false isn't
     */
    public boolean isEmpty() {
        return start == null;
    }

    /**
     * Empty the queue
     */
    public void Empty() {
        start = end = null;
        nData = 0;
    }

    /**
     * Allows to know about the size of the queue
     *
     * @return Integer -- How many elements there are in the stack
     */
    public int size() {
        return nData;
    }

    /**
     * Inserts an element to the queue
     *
     * @param element - The element to be added
     */
    public void add(Object element) {
        if (start == null) {
            start = end = new Node(element);
        } else {
            Node temp = new Node(element);
            end.next = temp;
            end = temp;
        }
        nData++;
    }

    /**
     * Takes the first element of the queue
     *
     * @return Object - The first element in the queue
     */
    public Object take() {
        return (start == null) ? null : start.element;
    }

    /**
     * Deletes the first element in the queue
     */
    public void delete() {
        if (start != null) {
            start = (Node) start.next;
        }
        nData--;
    }

    /**
     * Method to get an Iterator about the queue
     *
     * @return Iterator -- Iterator about the queue
     */
    public java.util.Iterator iterator() {
        return new MyIterator();
    }

    /**
     * Configurates an iterator with its attributes
     */
    private class MyIterator implements java.util.Iterator {

        private Node position = start;

        /**
         * Asks to the iterator if have a next position
         *
         * @return
         */
        public boolean hasNext() {
            return position != null;
        }

        /**
         * Returns the next object of a iterator
         *
         * @return The next element
         */
        public Object next() {
            if (hasNext()) {
                Object o = position.element;
                position = (Node) position.next;
                return o;
            }
            return null;
        }

        /**
         * Not implemented yet
         */
        public void remove() {
            throw new IllegalStateException();
        }
    }
}
