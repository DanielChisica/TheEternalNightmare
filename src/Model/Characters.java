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
public class Characters {
    
    private int hp;
    private int mp;
    private int atk;
    private int armor;
    private int magicalResistence;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    private SpecialSkill Skill1;
    private SpecialSkill Skill2;
    private SpecialSkill Skill3;

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
    private int hpLimit;
    private int mpLimit;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicalResistence() {
        return magicalResistence;
    }

    public void setMagicalResistence(int magicalResistence) {
        this.magicalResistence = magicalResistence;
    }

    public SpecialSkill getSkill1() {
        return Skill1;
    }

    public void setSkill1(SpecialSkill Skill1) {
        this.Skill1 = Skill1;
    }

    public SpecialSkill getSkill2() {
        return Skill2;
    }

    public void setSkill2(SpecialSkill Skill2) {
        this.Skill2 = Skill2;
    }

    public SpecialSkill getSkill3() {
        return Skill3;
    }

    public void setSkill3(SpecialSkill Skill3) {
        this.Skill3 = Skill3;
    }

    public Characters(int hp, int mp, int atk, int armor, int magicalResistence,
            int id, SpecialSkill Skill1, SpecialSkill Skill2,
            SpecialSkill Skill3, int hpLimit, int mpLimit) {
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.armor = armor;
        this.magicalResistence = magicalResistence;
        this.id = id;
        this.Skill1 = Skill1;
        this.Skill2 = Skill2;
        this.Skill3 = Skill3;
        this.hpLimit=hpLimit;
        this.mpLimit=mpLimit;
    }

   
    
    
    
    
}
