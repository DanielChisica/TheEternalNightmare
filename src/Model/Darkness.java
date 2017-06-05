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
public class Darkness extends Characters{
    private static SpecialSkill sword=new SpecialSkill(50);
    private static SpecialSkill darkAtk=new SpecialSkill(80);
    private static SpecialSkill throwsToes=new SpecialSkill(90);

    public Darkness() {
        super("Darkness",300, 200, 45, 0, 15, 05, sword, darkAtk, throwsToes, 300, 200);
    }
    
    
}
