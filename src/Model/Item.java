/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author EAN
 */
public class Item {

    private String name;

    private int id;

    private int hpRestored;
    
    private int mpRestored;

    public Item(String name, int id, int hpRestored, int mpRestored) {
        this.name = name;
        this.id = id;
        this.hpRestored = hpRestored;
        this.mpRestored = mpRestored;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHpRestored() {
        return hpRestored;
    }

    public void setHpRestored(int hpRestored) {
        this.hpRestored = hpRestored;
    }

    public int getMpRestored() {
        return mpRestored;
    }

    public void setMpRestored(int mpRestored) {
        this.mpRestored = mpRestored;
    }
    
    
}