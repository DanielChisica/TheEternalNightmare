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
public class SpecialSkill {

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
    
    private int magic;

    public SpecialSkill(int magic) {
        this.magic = magic;
    }
    
    
}
