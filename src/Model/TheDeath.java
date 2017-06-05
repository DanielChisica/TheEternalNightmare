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
public class TheDeath extends Characters{
    private static SpecialSkill flute=new SpecialSkill(110);
    private static SpecialSkill deathSong=new SpecialSkill(150);
    private static SpecialSkill deathRope=new SpecialSkill(130);

    public TheDeath() {
        super("TheDeath",400, 400, 45, 30, 30, 06, flute, deathSong, deathRope, 400, 400);
    }
    
    
}
