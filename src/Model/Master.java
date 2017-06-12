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
public class Master {

    public int getHpLimit() {
        return hpLimit;
    }

    public void setHpLimit(int hpLimit) {
        this.hpLimit = hpLimit;
    }

    public int getMpLimit() {
        return mpLimit;
    }

    public void setMpLimit(int mpLimit) {
        this.mpLimit = mpLimit;
    }

    public int getArmorLimit() {
        return armorLimit;
    }

    public void setArmorLimit(int armorLimit) {
        this.armorLimit = armorLimit;
    }

    public int getAtkLimit() {
        return atkLimit;
    }

    public void setAtkLimit(int atkLimit) {
        this.atkLimit = atkLimit;
    }

    public int getSpecialSkillLimit() {
        return specialSkillLimit;
    }

    public void setSpecialSkillLimit(int specialSkillLimit) {
        this.specialSkillLimit = specialSkillLimit;
    }

    public int getSpecialSkillLimit2() {
        return specialSkillLimit2;
    }

    public void setSpecialSkillLimit2(int specialSkillLimit2) {
        this.specialSkillLimit2 = specialSkillLimit2;
    }

    public int getSpecialSkillLimit3() {
        return specialSkillLimit3;
    }

    public void setSpecialSkillLimit3(int specialSkillLimit3) {
        this.specialSkillLimit3 = specialSkillLimit3;
    }

    public boolean isHasBeenTaken() {
        return hasBeenTaken;
    }

    public void setHasBeenTaken(boolean hasBeenTaken) {
        this.hasBeenTaken = hasBeenTaken;
    }
    private int hpLimit;
    private int mpLimit;
    private int armorLimit;
    private int atkLimit;
    private int specialSkillLimit;
    private int specialSkillLimit2;
    private int specialSkillLimit3;
    
    private boolean hasBeenTaken;

    public Master(int hpLimit, int mpLimit, int armorLimit, int atkLimit, int specialSkillLimit, int specialSkillLimit2, int specialSkillLimit3, boolean hasBeenTaken) {
        this.hpLimit = hpLimit;
        this.mpLimit = mpLimit;
        this.armorLimit = armorLimit;
        this.atkLimit = atkLimit;
        this.specialSkillLimit = specialSkillLimit;
        this.specialSkillLimit2 = specialSkillLimit2;
        this.specialSkillLimit3 = specialSkillLimit3;
        this.hasBeenTaken = hasBeenTaken;
    }

    
}
