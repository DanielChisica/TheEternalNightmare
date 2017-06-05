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
public class Ghost extends Characters{
    private static SpecialSkill fear=new SpecialSkill(18);
    private static SpecialSkill scream=new SpecialSkill(20);
    private static SpecialSkill curse=new SpecialSkill(25);

    public Ghost() {
        super("Ghost",50, 100, 15, 0,0, 04, fear, scream, curse,50,100);
    }
    
    
}
