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
public class Pearl extends Characters{
    
    private static SpecialSkill heal=new SpecialSkill(5);
    private static SpecialSkill increaseAtk=new SpecialSkill(8);
    private static SpecialSkill bringShield=new SpecialSkill(5);

    public Pearl() {
        super(200, 100, 0, 0, 75, 02, heal, increaseAtk, bringShield,200,100);
    }
    
    
    
}
