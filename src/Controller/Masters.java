/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Interfaces.Position;
import Model.LinkedTree;

/**
 *
 * @author AkaEx
 */
public class Masters {
    
    private LinkedTree mast = new LinkedTree();
    
    private int daño;
    private int description;

    public void setMast(LinkedTree mast) {
        this.mast = mast;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public LinkedTree getMast() {
        return mast;
    }

    public int getDaño() {
        return daño;
    }

    public int getDescription() {
        return description;
    }

    public Masters() {
    }

    public Masters(int daño, int description) {
        this.daño = daño;
        this.description = description;
    }
    
   Position rootmaste(){
      Position  a =mast.addRoot(daño);
      return a;
   }
   void addMater1(){
       mast.add(mast, rootmaste());
   }
   void addMater2(){
       mast.add(mast, rootmaste());
   }
   void addMater3(){
       mast.add(mast, rootmaste());
   }
    
    
}
