/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author danie_000
 */
public class Eddy extends Characters{
    private static SpecialSkill throwThorns=new SpecialSkill(20);
    private static SpecialSkill bite=new SpecialSkill(25);
    private static SpecialSkill rotationAtk=new SpecialSkill(30);//Return the rival atk

    public Eddy() {
        super(60, 70, 15, 10, 20, 03, throwThorns, bite, rotationAtk,60,70);
    }
    
    
}
