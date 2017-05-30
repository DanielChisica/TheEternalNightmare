/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.Random;

/**
 *
 * @author danie_000
 */
public class Battlefield {

    private Allen allen;
    private Eddy eddy;
    private Pearl pearl;

    private Characters rival1;
    private Characters rival2;
    private Characters rival3;
    private Characters rival4;
   
    
    
    public Battlefield(Allen allen, Eddy eddy, Pearl pearl, Characters rival1, Characters rival2, Characters rival3, Characters rival4) {
        this.allen = allen;
        this.eddy = eddy;
        this.pearl = pearl;
        this.rival1 = rival1;
        this.rival2 = rival2;
        this.rival3 = rival3;
        this.rival4 = rival4;
    }

    public void attack(Characters char1, Characters char2) {
        char2.setHp(char2.getHp() - (char1.getAtk() - char2.getArmor()));
    }

    public void specialAttack(Characters char1, Characters char2, SpecialSkill spk1) {
        char1.setMp(char1.getMp() - spk1.getMagic());
        char2.setHp(char2.getHp() - (spk1.getMagic() - char2.getMagicalResistence()));
    }

    public void rotationAttack(Eddy eddy1, Characters char2) {
        eddy1.setMp(eddy1.getMp() - (eddy1.getSkill3().getMagic()));
        char2.setHp(char2.getHp() - char2.getAtk());
    }

    public void heal() {
        pearl.setMp(pearl.getMp() - (pearl.getSkill1().getMagic()));
        allen.setHp(allen.getHp() + (pearl.getSkill1().getMagic()));
    }

    public void increaseAtk() {
        pearl.setMp(pearl.getMp() - (pearl.getSkill2().getMagic()));

        Random rand = new Random();
        int n = rand.nextInt(4) + 1;

        switch (n) {
            case 1:
                attack(allen, rival1);
                rival1.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                break;

            case 2:
                attack(allen, rival2);
                rival2.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                break;

            case 3:
                attack(allen, rival3);
                rival3.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                break;

            case 4:
                attack(allen, rival4);
                rival4.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                break;
        }

    }

    public void bringShield() {
        pearl.setMp(pearl.getMp() - (pearl.getSkill3().getMagic()));
        allen.setArmor(allen.getArmor() + pearl.getSkill3().getMagic());
    }

}
