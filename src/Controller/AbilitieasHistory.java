/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;

/**
 * This class configurates the functionality of a Shift Dispenser and its
 * methods
 *
 * @author Daniel Jiménez Chísica
 * @since 20 March 2017
 */
public class AbilitieasHistory {

    Queue queue = new Queue();
    private static int currentShift = 1;

    /**
     * Returns the queue of the Shift Dispenser
     *
     * @return The queue of the shift dispenser
     */
    public Queue getQueue() {
        return queue;
    }

    /**
     * Sets the queue of the shift dispenser
     *
     * @param queue The input queue
     */
    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    /**
     * Returns the current shift of the ShiftDispenser
     *
     * @return The current shift
     */
    public int getCurrentShift() {
        return currentShift;
    }

    /**
     * Sets the current shift to the Shift Dispenser
     *
     * @param currentShift The currentShift
     */
    public void setCurrentShift(int currentShift) {
        this.currentShift = currentShift;
    }

    /**
     * Queues a shift into the queue of the Shift Dispenser
     *
     * @param shift The shift to be queued
     * @return An iterator about the queue
     */
    public java.util.Iterator queueUp(Ability shift) {
        shift.setId(currentShift);
        queue.add(shift);
        currentShift++;
        return queue.iterator();
    }

    /**
     * Deletes a shift of the queue
     *
     * @return A iterator about the queue
     */
    public java.util.Iterator unPack() {
        queue.delete();
        return queue.iterator();
    }

}
