/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Set;
import Model.Item;
import java.util.Stack;

/**
 *
 * @author Johan Arenas
 */
public class Bag {

    private final Set content; 
    private Stack<Item> potion;

    public Bag() {
        content = new Set();
        potion= new Stack<>();

    }

    
    public void addToSet(Item e) {
        content.agregar(e);
    }

}
