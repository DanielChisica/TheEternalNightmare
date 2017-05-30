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
public class Allen extends Characters{
    
    private static SpecialSkill fireFist=new SpecialSkill(35);
    private static SpecialSkill shuriken=new SpecialSkill(37);
    private static SpecialSkill freeze=new SpecialSkill(32);
    

    public Allen() {
        super(100, 0, 30, 0, 0, 01,fireFist,shuriken,freeze,100,100);
    }
    
    
}
